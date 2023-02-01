package soccer.models;
import java.time.LocalTime;

public class Goal {
	
	private Team team;
	
	private Player player;
	
	private LocalTime time;

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

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Goal(Team team, Player player, LocalTime time) {
		this.team = team;
		this.player = player;
		this.time = time;
	}

    
	
	

}
