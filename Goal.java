package soccer.models;

public class Goal {
	
	private Team team;
	
	private Player player;
	
	private int time;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Goal(Team team, Player player, int time) {
		this.team = team;
		this.player = player;
		this.time = time;
	}

    
	
	

}
