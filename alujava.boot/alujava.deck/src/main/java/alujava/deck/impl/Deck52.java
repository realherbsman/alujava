package alujava.deck.impl;

import alujava.deck.DeckSize;

public class Deck52 extends AbstractDeck {

	private Deck52(DeckSize deckSize) {
		super(deckSize);
	}
	
	public Deck52() {
		this(DeckSize.DECK_52);
	}

}
