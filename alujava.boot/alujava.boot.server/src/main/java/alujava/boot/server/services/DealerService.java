package alujava.boot.server.services;

import alujava.deck.Card;

public interface DealerService {
	public Card getCard();
	public void putCard(Card card);
}
