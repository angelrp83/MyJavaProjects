package soccer.models;

public class GoalKeeper extends Player {
	
	//We could add some specific fields related to goalkeepers..

	public GoalKeeper(int playerId, String playerName) {
		super(playerId, playerName);
	}
    
	//it is very unlikely that a goalkeeper will score a goal
	@Override
	public boolean play() {
		return false;		
	}

}
