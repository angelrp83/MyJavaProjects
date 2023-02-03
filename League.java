package soccer;

import java.util.*;
import soccer.models.*;

public class League {
	
	static HashMap<Player, Integer> goalsXplayer = new HashMap<>();//goals for each player
	static HashMap<Team, Integer> pointsXTeam = new HashMap<>();//points for each team (3-win, 1-draw, 0-loss)
	static Game[] gameList = new Game[12];//array of all the games in the league
	
	//populate goalsXplayer 
	public static void fillGoalsXplayer (Game game) {
		
		if (game != null && game.getListOfGoals().size()>0) {
			
			for (Goal g : game.getListOfGoals()) {
				if (!(goalsXplayer.containsKey(g.getPlayer()))) {
					goalsXplayer.put(g.getPlayer(), 1);
				} else {
					goalsXplayer.replace(g.getPlayer(), goalsXplayer.get(g.getPlayer()) + 1);
				}
			}
		} 
	}
	
	//populate pointsXTeam 
		public static void fillpointsXTeam (Game game) {
			
			if (game != null) {
				//if team 1 wins, add 3 points
				if (game.winningTeam() == 1) {
					if (!(pointsXTeam.containsKey(game.getTeam1()))) {
						pointsXTeam.put(game.getTeam1(), 3);
					} else {
						pointsXTeam.replace(game.getTeam1(), pointsXTeam.get(game.getTeam1()) + 3);
					}
					//if team 2 wins, add 3 points
				} else if (game.winningTeam() == 2) {
					if (!(pointsXTeam.containsKey(game.getTeam2()))) {
						pointsXTeam.put(game.getTeam2(), 3);
					} else {
						pointsXTeam.replace(game.getTeam2(), pointsXTeam.get(game.getTeam2()) + 3);
					}
					//if game draw, add 1 points for each team
				} else if (game.winningTeam() == 0) {
					if (!(pointsXTeam.containsKey(game.getTeam1()))) {
						pointsXTeam.put(game.getTeam1(), 1);
					} else {
						pointsXTeam.replace(game.getTeam1(), pointsXTeam.get(game.getTeam1()) + 1);
					}
					if (!(pointsXTeam.containsKey(game.getTeam2()))) {
						pointsXTeam.put(game.getTeam2(), 1);
					} else {
						pointsXTeam.replace(game.getTeam2(), pointsXTeam.get(game.getTeam2()) + 1);
					}
				}
				
			} else
				System.out.println("Game not played");
		}
	
		
		// function to sort hashmap by values
	    public static <T> HashMap<T, Integer> sortByValue(HashMap<T, Integer> hm)
	    {
	        // Create a list from elements of HashMap
	        List<Map.Entry<T, Integer> > list =
	               new LinkedList<Map.Entry<T, Integer> >(hm.entrySet());
	        
	        Comparator<Map.Entry<T, Integer>> com = (o1,o2) -> o2.getValue().compareTo(o1.getValue());
	 
	        // Sort the list
	        Collections.sort(list, com);
	         
	        // put data from sorted list to hashmap
	        HashMap<T, Integer> temp = new LinkedHashMap<T, Integer>();
	        for (Map.Entry<T, Integer> entry : list) {
	            temp.put(entry.getKey(), entry.getValue());
	        }
	        return temp;
	    }  
	
	public static void displayHMgoalsXplayer(HashMap<Player,Integer> hm) {
		for (Map.Entry<Player, Integer> entry : hm.entrySet()) {
		    System.out.println(entry.getKey().getPlayerName() + " : "+ entry.getValue());
		}	
	}
	
	public static void displayHMpointsXTeam(HashMap<Team,Integer> hm) {
		for (Map.Entry<Team, Integer> entry : hm.entrySet()) {
		    System.out.println(entry.getKey().getTeamName() + " : "+ entry.getValue());
		}	
	}
	
	public static void playLeague() {
		
		for (int i = 0; i<12; i++) {
        	gameList[i].playGame();
        	fillGoalsXplayer(gameList[i]); 
        	fillpointsXTeam(gameList[i]);
        } 
	}
	
	public static void displayMainResults() {
		for (int i = 0; i<12; i++) {
        	gameList[i].displayMainResult();
        	System.out.println("\n");
        }
	}

	public static void main(String[] args) {
		

		
		//Creation players team1:
		Player t11 = new GoalKeeper(101,"Andres");
		Player t12 = new Defense(102,"Pedro");
		Player t13 = new Defense(103,"Carlos");
		Player t14 = new Defense(104,"Mario");
		Player t15 = new Defense(105,"Rene");
		Player t16 = new Midfielder(106,"Iniesta");
		Player t17 = new Midfielder(107,"Xavi");
		Player t18 = new Midfielder(108,"Baru");
		Player t19 = new Midfielder(109,"Koke");
		Player t110 = new Striker(110,"Soldado");
		Player t111 = new Striker(111,"Villa");
		
		//Creation players team2:
		Player t21 = new GoalKeeper(201,"Allison");
		Player t22 = new Defense(202,"Alex");
		Player t23 = new Defense(203,"Thiago");
		Player t24 = new Defense(204,"Marquinhos");
		Player t25 = new Defense(205,"Militao");
		Player t26 = new Midfielder(206,"Casemiro");
		Player t27 = new Midfielder(207,"Neymar");
		Player t28 = new Midfielder(208,"Lucas");
		Player t29 = new Midfielder(209,"Rapphinha");
		Player t210 = new Striker(210,"Gabriel");
		Player t211 = new Striker(211,"Vinicius");
		
		//Creation players team3:
		Player t31 = new GoalKeeper(301,"Hugo");
		Player t32 = new Defense(302,"Varane");
		Player t33 = new Defense(303,"Kounde");
		Player t34 = new Defense(304,"Pavard");
		Player t35 = new Defense(305,"Hernandez");
		Player t36 = new Midfielder(306,"Rabiot");
		Player t37 = new Midfielder(307,"Tchouameni");
		Player t38 = new Midfielder(308,"Fofana");
		Player t39 = new Midfielder(309,"Camavinga");
		Player t310 = new Striker(310,"Griezmann");
		Player t311 = new Striker(311,"Mbappe");
		
		//Creation players team4:
		Player t41 = new GoalKeeper(401,"Emiliano");
		Player t42 = new Defense(402,"Otamendi");
		Player t43 = new Defense(403,"Montiel");
		Player t44 = new Defense(404,"Taglafico");
		Player t45 = new Defense(405,"Lisandro");
		Player t46 = new Midfielder(406,"Rodrigo");
		Player t47 = new Midfielder(407,"Enzo");
		Player t48 = new Midfielder(408,"Leandro");
		Player t49 = new Midfielder(409,"Alexis");
		Player t410 = new Striker(410,"Angel");
		Player t411 = new Striker(411,"Messi");
		
		//Creation team1:
		Player[] listPlayers1 = {t11,t12,t13,t14,t15,t16,t17,t18,t19,t110,t111};
		Team team1 = new Team(01,"Spain",listPlayers1);
		
		//Creation team2:
		Player[] listPlayers2 = {t21,t22,t23,t24,t25,t26,t27,t28,t29,t210,t211};
		Team team2 = new Team(02,"Brazil",listPlayers2);
		
		//Creation team3:
		Player[] listPlayers3 = {t31,t32,t33,t34,t35,t36,t37,t38,t39,t310,t311};
		Team team3 = new Team(03,"France",listPlayers3);
		
		//Creation team4:
		Player[] listPlayers4 = {t41,t42,t43,t44,t45,t46,t47,t48,t49,t410,t411};
		Team team4 = new Team(04,"Argentina",listPlayers4);
		
		//Showing the teams
		System.out.print("\n");
		System.out.print(team1.getTeamName() + " : ");
		team1.displayNames();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(team2.getTeamName() + " : ");
		team2.displayNames();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(team3.getTeamName() + " : ");
		team3.displayNames();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(team4.getTeamName() + " : ");
		team4.displayNames();
		System.out.print("\n");
		System.out.print("\n");
		
	    //Game creation round 1-- Each team play once as a visitor and once as a local with each of the other teams
		gameList[0] = new Game(team1,team2);
		gameList[1] = new Game(team3,team4);
		gameList[2] = new Game(team1,team3);
		gameList[3] = new Game(team2,team4);
		gameList[4] = new Game(team1,team4);
		gameList[5] = new Game(team2,team3);
		
		//Game creation round 2
		gameList[6] = new Game(team2,team1);
		gameList[7] = new Game(team4,team3);
		gameList[8] = new Game(team3,team1);
		gameList[9] = new Game(team4,team2);
		gameList[10] = new Game(team4,team1);
		gameList[11] = new Game(team3,team2); 
		
		
		 //Play the league (all games..)
        playLeague();
        
        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        do {
        	 System.out.print("\n");
        	 System.out.println("Choose one option from the Menu :");
        	 System.out.print("\n");
        	 System.out.println("( 1 ) : Display the results of the played league.");
        	 System.out.println("( 2 ) : Display the results of a specific game.");
        	 System.out.println("( 3 ) : Exit the App.");
        	 System.out.print("\n");
        	 
        	 int op = sc.nextInt();
        	 
        	 switch (op) {
        	   case 1: 
        		  System.out.println("ALL MATCH RESULTS :");
        		  displayMainResults();
        		 // System.out.println("\n");
        		  System.out.println("SCORE TABLE BY TEAM :");
        		  displayHMpointsXTeam(sortByValue(pointsXTeam));
        		  System.out.println("\n");
        		  System.out.println("LEAGUE GOALSCORERS :");
        		  displayHMgoalsXplayer(sortByValue(goalsXplayer));
        		  System.out.println("\n");
        		 break;
        	   case 2:
              	 System.out.print("\n");
            	 System.out.println("Choose one option from the Menu :");
            	 System.out.print("\n");
            	 System.out.println("( 1 ) : Spain vs Brazil");
            	 System.out.println("( 2 ) : France vs Argentina");
            	 System.out.println("( 3 ) : Spain vs France");
            	 System.out.println("( 4 ) : Brazil vs Argentina");
            	 System.out.println("( 5 ) : Spain vs Argentina");
            	 System.out.println("( 6 ) : Brazil vs France");
            	 System.out.println("( 7 ) : Brazil vs Spain");
            	 System.out.println("( 8 ) : Argentina vs France");
            	 System.out.println("( 9 ) : France vs Spain");
            	 System.out.println("( 10 ) : Argentina vs Brazil");
            	 System.out.println("( 11 ) : Argentina vs Spain");
            	 System.out.println("( 12 ) : France vs Brazil");
            	 System.out.print("\n");
            	 op = sc.nextInt();
            	 switch (op) {
            	    case 1:
            	    	gameList[0].displayResultsGame();
            	    	break;
            	    case 2:
            	    	gameList[1].displayResultsGame();
            	    	break;
            	    case 3:
            	    	gameList[2].displayResultsGame();
            	    	break;
            	    case 4:
            	    	gameList[3].displayResultsGame();
            	    	break;
            	    case 5:
            	    	gameList[4].displayResultsGame();
            	    	break;
            	    case 6:
            	    	gameList[5].displayResultsGame();
            	    	break;
            	    case 7:
            	    	gameList[6].displayResultsGame();
            	    	break;
            	    case 8:
            	    	gameList[7].displayResultsGame();
            	    	break;
            	    case 9:
            	    	gameList[8].displayResultsGame();
            	    	break;
            	    case 10:
            	    	gameList[9].displayResultsGame();
            	    	break;
            	    case 11:
            	    	gameList[10].displayResultsGame();
            	    	break;
            	    case 12:
            	    	gameList[11].displayResultsGame();
            	    	break;
            	    default :
            	    	System.out.println("Invalid..! Please enter a Valid Option, Thanks!"); 
            	 }
        		 break;
        	   case 3:
        		 System.out.println("Liga terminada!");
        		 sc.close();
        		 System.exit(0);
        	   default:
        		 System.out.println("Invalid..! Please enter a Valid Option, Thanks!");
        	 }
        	 
        } while (true);
		

	}

}
