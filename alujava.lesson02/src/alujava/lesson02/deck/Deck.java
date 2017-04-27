package alujava.lesson02.deck;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

abstract class Deck implements DeckIntf {

	private CardIntf[] cards;
	private final DeckSize deckSize;
	
	public Deck(DeckSize deckSize) {
		this.deckSize = deckSize;
		this.cards = new Card[this.deckSize.getDeckSize()];
		
		int i = 0;
		for (CardSuit suit : CardSuit.values()) {
			for (CardRank rank : deckSize.getCardRanks()) {
				this.cards[i] = new Card(suit, rank);
				i++;
			}
		}
		
	}
	
	@Override
	public DeckSize getInitialDeckSize() {
		return this.deckSize;
	}

	@Override
	public int getDeckSize() {
		return this.cards.length;
	}

	@Override
	public CardIntf getCard() {
		CardIntf result = null;
		
		if (this.cards.length > 0) {
			result = this.cards[0];
			
			CardIntf[] newDeck;
			if (this.cards.length > 1) {
				newDeck = Arrays.copyOfRange(this.cards, 1, this.cards.length);
			} else {
				newDeck = new Card[0];				
			}
			this.cards = newDeck;
		}
		
		return result;
	}

	@Override
	public void putCard(int position, CardIntf card) {
		int index = (position < 0) ? 0 : ((position > this.cards.length) ? this.cards.length : position);
		CardIntf[] newDeck = new Card[this.getDeckSize() + 1];
		for (int i = 0; i < index; i++) {
			newDeck[i] = this.cards[i];
		}
		newDeck[index] = card;
		for (int i = index + 1; i < newDeck.length; i++) {
			newDeck[i] = this.cards[i - 1];
		}
		this.cards = newDeck;
	}

	@Override
	public void shuffle() {
		Random rnd = ThreadLocalRandom.current();
		
		for (int j = this.cards.length - 1; j > 0; j--) {
			for (int i = this.cards.length - 1; i > 0; i--) {
				int index = rnd.nextInt(i + 1);
				// Simple swap
				CardIntf card = this.cards[index];
				this.cards[index] = this.cards[i];
				this.cards[i] = card;
			}
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.cards);
	}

}
