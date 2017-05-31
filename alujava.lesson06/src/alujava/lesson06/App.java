package alujava.lesson06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import alujava.lesson06.deck.Deck52;
import alujava.lesson06.deck.DeckIntf;
import alujava.lesson06.person.Dealer;
import alujava.lesson06.person.Player;

public class App {

	private static Config conf;
	
	public static void main(String[] args) {

		conf = getConfig();
		DeckIntf deck = new Deck52();
		deck.shuffle();
		Dealer dealer = new Dealer(deck);
		List<ConcurrentJob> jobList = new ArrayList<ConcurrentJob>();
		for (int i = 0; i < conf.getPlayerCount(); i++) {
			Player player = new Player(dealer, i);
			jobList.add(new ConcurrentJob(player, new JobCallback(conf.getSavePath(), player)));
		}
		ExecutorService es = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		
		for (ConcurrentJob job : jobList) {
			es.execute(job);
		}
		
	}
	
	private static Config getConfig() {
		Config result = new Config();
		
		Path configPath = Paths.get( ClassLoader.getSystemClassLoader().getResource(".").getPath(), "config.properties" ).toAbsolutePath();
		System.out.println("config file = " + configPath.toString());
		
		Properties config = new Properties();
		if (!Files.exists(configPath)) {
			config.setProperty(Config.SAVE_PATH, configPath.getParent().toString());
			config.setProperty(Config.PLAYER_COUNT, "10");
			try {
				config.store(new FileWriter(configPath.toFile()), "");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (Files.exists(configPath)) {
			try {
				config.load(new FileReader(configPath.toFile()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 

		result.setSavePath((String)config.getProperty(Config.SAVE_PATH, configPath.getParent().toString()));
		result.setPlayerCount(Integer.valueOf(config.getProperty(Config.PLAYER_COUNT, "10")));
		
		System.out.println("save path = " + result.getSavePath());
		System.out.println("player count = " + result.getPlayerCount());
		
		return result;
	}

}
