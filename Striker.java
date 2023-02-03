package soccer.models;

import java.util.Random;

public class Striker extends Player {
	
	//We could add some specific fields related to strikers..

	public Striker(int playerId, String playerName) {
		super(playerId, playerName);
	}

	@Override
	public boolean play() {

		Random rn = new Random();
		int ran = rn.nextInt(10);
		
		return ran >= 7 ? true : false; //30% chance of scoring a goal	
		
	}

}
