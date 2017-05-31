package alujava.lesson06;

import java.util.concurrent.ThreadLocalRandom;

import alujava.lesson06.person.Player;

public class ConcurrentJob implements Runnable {

	private Player player;
	private ICallback callback;
	
	public ConcurrentJob(Player player, ICallback callback) {
		this.player = player;
		this.callback = callback;
	}
	
	@Override
	public void run() {
		boolean doAgain = true;
		
		while (doAgain) {
			long randomInterval = ThreadLocalRandom.current().nextLong(40L, 50L);

			try {
				Thread.sleep(randomInterval);
				doAgain = player.requestCard();
				doAgain = ((doAgain) && (!Thread.currentThread().isInterrupted())); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread.yield();
		}
		
		if (this.callback != null) {
			this.callback.callback();
		}
	}

}
