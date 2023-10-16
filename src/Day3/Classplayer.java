package Day3;

public class Classplayer {
	private String playerName;
	private String country;
	private String skills;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public Classplayer(String playerName, String country, String skills) {
		super();
		this.playerName = playerName;
		this.country = country;
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Classplayer [playerName=" + playerName + ", country=" + country + ", skills=" + skills + "]";
	}
	

}
