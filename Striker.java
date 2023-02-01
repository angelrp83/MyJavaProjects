package soccer.models;

public class Striker extends Player {
	
	//We could add some specific fields related to strikers..

	public Striker(int playerId, String playerName) {
		super(playerId, playerName);
	}

	@Override
	public void play() {
		System.out.println("My game is to score the goals");
		
	}

}
