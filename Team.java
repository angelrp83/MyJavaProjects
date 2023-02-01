package soccer.models;

public class Team {
	
	private int teamId; 
	
	private String teamName;
	
	private Player[] ListOfPlayers;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Player[] getListOfPlayers() {
		return ListOfPlayers;
	}

	public void setListOfPlayers(Player[] listOfPlayers) {
		if (checkValidTeam(listOfPlayers)) {
		   ListOfPlayers = listOfPlayers;
		} else 
			System.out.println("Invalid team provided");
	}

	public Team(int teamId, String teamName, Player[] listOfPlayers) {
		if (checkValidTeam(listOfPlayers)) {
		   this.teamId = teamId;
		   this.teamName = teamName;
		   ListOfPlayers = listOfPlayers;
		} else
			System.out.println("Invalid team provided");
	}
	
	//check if the team has at least 11 players and nor more than 22, as well as there is no repeated player ids
	public boolean checkValidTeam(Player[] listOfPlayers) {
		if (listOfPlayers.length >= 11 && listOfPlayers.length <= 22) {
			for (int i = 0; i < listOfPlayers.length; i++)
				for (int j = i+1; j < listOfPlayers.length; j++ ) {
					 if (listOfPlayers[i].getPlayerId() == listOfPlayers[j].getPlayerId())
						 return false;	 
				}
			return true;
		} else 
			return false;
	}
	
	public void displayNames() {
		for (Player p : ListOfPlayers) {
			System.out.print(p.getPlayerName() + "  ");
		}
	}

}
