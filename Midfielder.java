package soccer.models;

import java.util.Random;

public class Midfielder extends Player {
	
	//We could add some specific fields related to midfielders..

	public Midfielder(int playerId, String playerName) {
		super(playerId, playerName);
	}

	@Override
	public boolean play() {
		
		Random rn = new Random();
		int ran = rn.nextInt(13);
		
		return ran >= 11 ? true : false; // about 15% chance of scoring a goal	
	}

}
