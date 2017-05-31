package alujava.lesson06.person;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import alujava.lesson06.deck.CardIntf;
import alujava.lesson06.deck.DeckIntf;

public class Dealer extends Person {

	private Lock lock;
	
	public Dealer(DeckIntf deck) {
		this.deck = deck;
		this.lock = new ReentrantLock();
	}
	
	public CardIntf getCard() {
		CardIntf result = null;
		if (lock.tryLock()) {
			try {
				result = this.deck.getCard();
			} finally {
				lock.unlock();
			}
		} else {
			System.out.println("dealer is busy...");
			lock.lock();
			try {
				result = this.deck.getCard();
			} finally {
				lock.unlock();
			}
		}
		return result;
	}
	
}
