import java.time.LocalTime;

public class Goal {
	
	private int teamId;
	
	private int playerId;
	
	private LocalTime time;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Goal(int teamId, int playerId, LocalTime time) {
		this.teamId = teamId;
		this.playerId = playerId;
		this.time = time;
	}
	
	

}
