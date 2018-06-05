package alujava.boot.server.services.impl;

import org.springframework.stereotype.Service;

import alujava.boot.server.exceptions.DuplicateCardException;
import alujava.boot.server.exceptions.InvalidCardException;
import alujava.boot.server.exceptions.NoCardException;
import alujava.boot.server.services.DealerService;
import alujava.deck.Card;
import alujava.deck.Deck;
import alujava.deck.impl.Deck52;

@Service
public class DealerServiceImpl implements DealerService {

	private Deck deck;
	private Deck etalon;
	
	public DealerServiceImpl() {
		deck = new Deck52();
		etalon = new Deck52();
	}
	
	@Override
	public Card getCard() {
		Card result = null;
		synchronized(deck) {
			result = deck.getCard();
		}
		
		if (result == null) {
			throw new NoCardException();
		}
		
		return result;
	}

	@Override
	public void putCard(Card card) {
		if (etalon.contains(card)) {
			synchronized(deck) {
				if (!deck.contains(card)) {
					deck.putCard(deck.getDeckSize(), card);
				} else {
					throw new DuplicateCardException();
				}
			}
		} else {
			throw new InvalidCardException();
		}
	}

	
	
}
