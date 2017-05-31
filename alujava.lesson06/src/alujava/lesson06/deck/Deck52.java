package alujava.lesson06.deck;

public class Deck52 extends Deck {

	private Deck52(DeckSize deckSize) {
		super(deckSize);
	}
	
	public Deck52() {
		this(DeckSize.DECK_52);
	}

}
