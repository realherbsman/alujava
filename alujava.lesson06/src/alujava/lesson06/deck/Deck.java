package alujava.lesson06.deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

abstract class Deck implements DeckIntf {

	private List<CardIntf> cards;
	private final DeckSize deckSize;
	
	public Deck(DeckSize deckSize) {
		this.deckSize = deckSize;
		this.cards = new ArrayList<CardIntf>();
		
		for (CardSuit suit : CardSuit.values()) {
			for (CardRank rank : deckSize.getCardRanks()) {
				this.cards.add(new Card(suit, rank));
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
	public CardIntf getCard() {
		CardIntf result = null;
		
		if (this.getDeckSize() > 0) {
			result = this.cards.remove(0);
		}
		
		return result;
	}

	@Override
	public void putCard(int position, CardIntf card) {
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
				CardIntf card = this.cards.get(index);
				this.cards.set(index, this.cards.get(i));
				this.cards.set(i, card);
			}
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.cards.toArray(new CardIntf[this.cards.size()]));
	}

}
