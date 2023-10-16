package day02;

public class Match {
	private String country;
	private String captain;
	private int noofmatches;
	public Match(String country, String captain, int noofmatches) {
		super();
		this.country = country;
		this.captain = captain;
		this.noofmatches = noofmatches;
	}
	@Override
	public String toString() {
		return "Match [country=" + country + ", captain=" + captain + ", noofmatches=" + noofmatches + "]";
	}

	

}
