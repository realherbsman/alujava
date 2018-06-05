package alujava.deck.impl;

import alujava.deck.Card;
import alujava.deck.CardRank;
import alujava.deck.CardSuit;

public class CardImpl implements Card {

	private final CardSuit cardSuit;
	private final CardRank cardRank;
	
	public CardImpl(CardSuit cardSuit, CardRank cardRank) {
		this.cardSuit = cardSuit;
		this.cardRank = cardRank;
	}
	
	@Override
	public CardSuit getCardSuit() {
		return this.cardSuit;
	}

	@Override
	public CardRank getCardRank() {
		return this.cardRank;
	}

	@Override
	public String toString() {
		return String.format("{%s, %s}", getCardSuit().getDescription(), getCardRank().getDescription());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardRank == null) ? 0 : cardRank.hashCode());
		result = prime * result + ((cardSuit == null) ? 0 : cardSuit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardImpl other = (CardImpl) obj;
		if (cardRank != other.cardRank)
			return false;
		if (cardSuit != other.cardSuit)
			return false;
		return true;
	}
}
