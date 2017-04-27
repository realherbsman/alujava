package alujava.lesson02;

import alujava.lesson02.deck.*;

public class App {

	public static void main(String[] args) {
		doSomething(new Deck36());
		doSomething(new Deck52());
	}
	
	private static void doSomething(DeckIntf deck) {
		System.out.println("Begin doSomething...");
		
		describeActualClass(deck.getClass());
		
		System.out.println("Initial size is: " + deck.getDeckSize());
		deck.shuffle();
		for (int i = 0; i < 6; i++) {
			System.out.println(deck.getCard());
		}
		System.out.println(deck);
		System.out.println("End doSomething...");
	}

	private static void describeActualClass(Class<?> clazz) {
		System.out.println(String.format(
						"\tDeck class is %s", clazz.getName()));
		StringBuilder sb;
		
		sb = new StringBuilder();
		for(Class<?> intf : clazz.getInterfaces()) {
			sb.append("\tDeck implements interface ").append(intf.getName()).append("\n");
		}
		System.out.print(sb.toString());
		
		sb = new StringBuilder("\tDeck superclass chain is:\n");
		while(clazz.getSuperclass() != null) {
			clazz = clazz.getSuperclass();
			sb.append("\t\t").append(clazz.getName()).append("\n");
		}
		System.out.print(sb.toString());
	}
}
