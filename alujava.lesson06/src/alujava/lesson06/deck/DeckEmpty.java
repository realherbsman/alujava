package alujava.lesson06.deck;

public class DeckEmpty extends Deck {

	private DeckEmpty(DeckSize deckSize) {
		super(deckSize);
	}

	public DeckEmpty() {
		this(DeckSize.DECK_EMPTY);
	}
	
}
