package soccer.models;

public class GoalKeeper extends Player {
	
	//We could add some specific fields related to goalkeepers..

	public GoalKeeper(int playerId, String playerName) {
		super(playerId, playerName);
	}

	@Override
	public void play() {
		System.out.println("My game is to prevent the ball from entering the goal");		
	}

}
