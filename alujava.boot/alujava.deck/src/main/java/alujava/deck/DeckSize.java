package alujava.deck;

import static alujava.deck.CardRank.*;

public enum DeckSize {
	DECK_EMPTY(0),
	DECK_36(36, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE),
	DECK_52(52, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE);
	
	private final CardRank[] cardRanks;
	private final int deckSize;
	
	private DeckSize(int deckSize, CardRank... cardRanks) {
		this.deckSize = deckSize;
		this.cardRanks = cardRanks;
	}
	
	public CardRank[] getCardRanks() {
		return this.cardRanks; 
	}

	public int getDeckSize() {
		return deckSize;
	}
}
