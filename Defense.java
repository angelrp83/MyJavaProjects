package soccer.models;

import java.util.Random;

public class Defense extends Player {
	
	//We could add some specific fields related to defenses..

	public Defense(int playerId, String playerName) {
		super(playerId, playerName);
	}

	@Override
	public boolean play() {
		
		Random rn = new Random();
		int ran = rn.nextInt(14);
		
		return ran == 9 ? true : false; //about 7% chance of scoring a goal
	}

}
