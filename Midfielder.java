
public class Midfielder extends Player {
	
	//We could add some specific fields related to midfielders..

	public Midfielder(int playerId, String playerName) {
		super(playerId, playerName);
	}

	@Override
	public void play() {
		System.out.println("My game is to create plays and give effective passes");		
	}

}
