
public class League {

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
		Player t110 = new Midfielder(110,"Soldado");
		Player t111 = new Midfielder(111,"Villa");
		
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
		Player t210 = new Midfielder(210,"Gabriel");
		Player t211 = new Midfielder(211,"Vinicius");
		
		//Creation team1:
		Player[] listPlayers1 = {t11,t12,t13,t14,t15,t16,t17,t18,t19,t110,t111};
		Team team1 = new Team(01,"Spain",listPlayers1);
		
		//Creation team2:
		Player[] listPlayers2 = {t21,t22,t23,t24,t25,t26,t27,t28,t29,t210,t211};
		Team team2 = new Team(02,"Brasil",listPlayers2);
		
		//Game creation
		Game game1 = new Game(team1,team2);
		
		//Playing game
		game1.playGame();
		
		//Display Game results:
		game1.displayResultsGame();

	}

}
