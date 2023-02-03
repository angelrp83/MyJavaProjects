package soccer.models;

public abstract class Player {
	
	private int playerId;
	
	private String playerName;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public Player(int playerId, String playerName) {
		this.playerId = playerId;
		this.playerName = playerName;
	}

	//returns true if the player score a goal
	public abstract boolean play();
		

}
