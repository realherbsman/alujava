package alujava.deck.impl;

import alujava.deck.DeckSize;

public class Deck36 extends AbstractDeck {

	private Deck36(DeckSize deckSize) {
		super(deckSize);
	}
	
	public Deck36() {
		this(DeckSize.DECK_36);
	}

}
