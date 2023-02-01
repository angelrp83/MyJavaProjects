package soccer.models;

public class Defense extends Player {
	
	//We could add some specific fields related to defenses..

	public Defense(int playerId, String playerName) {
		super(playerId, playerName);
	}

	@Override
	public void play() {
		System.out.println("My game is to protect the defensive zone");		
	}

}
