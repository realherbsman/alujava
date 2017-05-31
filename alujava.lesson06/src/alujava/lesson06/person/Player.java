package alujava.lesson06.person;

import alujava.lesson06.deck.CardIntf;
import alujava.lesson06.deck.DeckEmpty;
import alujava.lesson06.deck.DeckIntf;

public class Player extends Person {

	private Dealer dealer;
	private int position;
	
	public Player(Dealer dealer, int position) {
		this.dealer = dealer;
		this.position = position;
		this.deck = new DeckEmpty();
	}
	
	public boolean requestCard() {
		boolean result = false;

		CardIntf card = dealer.getCard();
		result = (card != null);
		if (result) {
			System.out.println(String.format("%d: %s", this.position, card.toString()));
			this.deck.putCard(0, card);
		}
		
		return result;
	}
	
	public DeckIntf getDeck() {
		return this.deck;
	}
	
	public String getName() {
		return String.format("%d.player", position);
	}
	
}
