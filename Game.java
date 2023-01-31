import java.time.LocalTime;
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

	public Game(Team team1, Team team2) {
		this.team1 = team1;
		this.team2 = team2;
	}
	
	public void teamPerforming(Team team) {
		for (int i = 0; i < team.getListOfPlayers().length; i++) {
			Random rn = new Random();
			int ran = rn.nextInt(10);
			if (ran >= 8) {
				Goal goal = new Goal(team.getTeamId(),team.getListOfPlayers()[i].getPlayerId(), LocalTime.now());
				ListOfGoals.add(goal);
			}
		}		
	}
	
	
	public void playGame() {
		teamPerforming(team1);
		teamPerforming(team2);
		this.status = "finalized";
	}
	    	
	
	public void displayResultsGame() {
	  if (status.equals("finalized")) {	
		int count1 = 0;
		int count2 = 0;
		
		if (ListOfGoals.size() > 0) {
		   for (int i = 0; i < ListOfGoals.size(); i++) {
			   if (ListOfGoals.get(i).getTeamId() == team1.getTeamId()) {
				   count1++;
			   } else {
				   count2++;
			   }
		   }
		}
		System.out.println("Game results:\n" + team1.getTeamName() + " : " + count1 + "\n" + team2.getTeamName() + " : " + count2);
		if (count1 != count2) {
		   System.out.println("Winning team : " + (count1 > count2 ? team1.getTeamName() : team2.getTeamName()));
		}
		
	  } else 
		  System.out.println("Game not played yet");
		
	}
	  

}
