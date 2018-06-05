package alujava.deck.impl;

import alujava.deck.DeckSize;

public class DeckEmpty extends AbstractDeck {

	private DeckEmpty(DeckSize deckSize) {
		super(deckSize);
	}

	public DeckEmpty() {
		this(DeckSize.DECK_EMPTY);
	}
	
}
