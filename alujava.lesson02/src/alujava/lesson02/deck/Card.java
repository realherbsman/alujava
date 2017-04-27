package alujava.lesson02.deck;

public class Card implements CardIntf {

	private final CardSuit cardSuit;
	private final CardRank cardRank;
	
	public Card(CardSuit cardSuit, CardRank cardRank) {
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

}
