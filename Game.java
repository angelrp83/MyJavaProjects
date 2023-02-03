package soccer.models;
import java.util.ArrayList;
import java.util.Random;

public class Game {
	
	private Team team1;
	
	private Team team2;
	
	private String status = "programmed";
	
	private ArrayList<Goal> ListOfGoals = new ArrayList<>();

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	
	public ArrayList<Goal> getListOfGoals() {
		return ListOfGoals;
	}

	public Game(Team team1, Team team2) {
		this.team1 = team1;
		this.team2 = team2;
	}
	

	//traverse the list of players and generate zero or more goals per player..
	public void teamPerforming(Team team) {
		Random rn = new Random();
		for (int i = 0; i < team.getListOfPlayers().length; i++) {
			
			boolean flag = true; //while flag is true, the player has the chance to score more goals in a match
			
			while (flag) {
			   if (team.getListOfPlayers()[i].play()) {
				   ListOfGoals.add(new Goal(team, team.getListOfPlayers()[i], rn.nextInt(90) + 1 ));
			   } else
				   flag = false;	
			}
			
		}		
	}
	
	
	public void playGame() {
		teamPerforming(team1);
		teamPerforming(team2);
		this.status = "finalized";
	}
	
	public int winningTeam() {
		 if (status.equals("finalized")) {	
				int count1 = 0;
				int count2 = 0;
				
				if (ListOfGoals.size() > 0) {
				   for (int i = 0; i < ListOfGoals.size(); i++) {
					   if (ListOfGoals.get(i).getTeam() == team1) {
						   count1++;
					   } else {
						   count2++;
					   }
				   }
				}
				if (count1 != count2) {
                   return count1 > count2 ? 1 : 2; //returns: 1-win team1, 2-win team2
				} else
					return 0;//return 0 if game draw				
			  } else 
				  return -1; //-1 if game not finalized
	}
	    	
	
	public void displayResultsGame() {
	 
		if (status.equals("finalized")) {	
		int count1 = 0;
		int count2 = 0;
		
		System.out.println("Goals :");
		if (ListOfGoals.size() > 0) {
		   for (int i = 0; i < ListOfGoals.size(); i++) {
			   if (ListOfGoals.get(i).getTeam() == team1) {
				   count1++;
			   } else {
				   count2++;
			   }
			   System.out.println(ListOfGoals.get(i).getPlayer().getPlayerName() + " (" + ListOfGoals.get(i).getTeam().getTeamName() + ") " + "at min " + ListOfGoals.get(i).getTime());
		   }
		}
		System.out.println("\n");
		System.out.println("Game results:\n" + team1.getTeamName() + " : " + count1 + "\n" + team2.getTeamName() + " : " + count2);
		if (count1 != count2) {
		   System.out.println("Winning team : " + (count1 > count2 ? team1.getTeamName() : team2.getTeamName()));
		} else
			System.out.println("Game draw!");
		System.out.println("\n");
		
	  } else 
		  System.out.println("Game not played yet"); 
				
	}
	
	public void displayMainResult() { 
		if (status.equals("finalized")) {	
		int count1 = 0; int count2 = 0;
		if (ListOfGoals.size() > 0) {
		   for (int i = 0; i < ListOfGoals.size(); i++) {
			   if (ListOfGoals.get(i).getTeam() == team1) {
				   count1++;
			   } else {
				   count2++;
			   }  
		   }
		}
		System.out.println(team1.getTeamName() + " : " + count1 + "\n" + team2.getTeamName() + " : " + count2);
	
	  } else 
		  System.out.println("Game not played yet"); 				
	}
	  

}
