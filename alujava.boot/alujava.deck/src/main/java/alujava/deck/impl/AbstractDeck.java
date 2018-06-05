package alujava.deck.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import alujava.deck.Card;
import alujava.deck.CardRank;
import alujava.deck.CardSuit;
import alujava.deck.Deck;
import alujava.deck.DeckSize;

abstract class AbstractDeck implements Deck {

	private List<Card> cards;
	private final DeckSize deckSize;
	
	public AbstractDeck(DeckSize deckSize) {
		this.deckSize = deckSize;
		this.cards = new ArrayList<Card>();
		
		for (CardSuit suit : CardSuit.values()) {
			for (CardRank rank : deckSize.getCardRanks()) {
				this.cards.add(new CardImpl(suit, rank));
			}
		}
		
	}
	
	@Override
	public DeckSize getInitialDeckSize() {
		return this.deckSize;
	}

	@Override
	public int getDeckSize() {
		return this.cards.size();
	}

	@Override
	public Card getCard() {
		Card result = null;
		
		if (this.getDeckSize() > 0) {
			result = this.cards.remove(0);
		}
		
		return result;
	}

	@Override
	public void putCard(int position, Card card) {
		int index = (position < 0) ? 0 : ((position > this.cards.size()) ? this.cards.size() : position);
		this.cards.add(index, card);
	}

	@Override
	public void shuffle() {
		Random rnd = ThreadLocalRandom.current();
		
		for (int j = this.cards.size() - 1; j > 0; j--) {
			for (int i = this.cards.size() - 1; i > 0; i--) {
				int index = rnd.nextInt(i + 1);
				// Simple swap
				Card card = this.cards.get(index);
				this.cards.set(index, this.cards.get(i));
				this.cards.set(i, card);
			}
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.cards.toArray(new Card[this.cards.size()]));
	}

	@Override
	public boolean contains(Card card) {
		return this.cards.contains(card);
	}
	
}
