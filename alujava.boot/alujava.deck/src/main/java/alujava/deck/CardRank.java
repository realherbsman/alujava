package alujava.deck;

public enum CardRank {
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("10"),
	JACK("валет"),
	QUEEN("дама"),
	KING("король"),
	ACE("туз");
	
	private final String description;
	
	private CardRank(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
