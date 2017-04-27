package alujava.lesson02.deck;

public enum CardSuit {
	SPADES("пики"),
	DIAMONDS("бубны"),
	HEARTS("червы"),
	CLUBS("трефы");
	
	private final String description;
	
	private CardSuit(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
}
