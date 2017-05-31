package alujava.lesson06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;

import alujava.lesson06.person.Player;

public class JobCallback implements ICallback {
	
	private String path;
	private Player player;
	
	public JobCallback(String path, Player player) {
		this.player = player;
		this.path = path;
	}
	
	@Override
	public void callback() {
		Path savePath = Paths.get(path, player.getName());
		Writer writer = null;
		try {
			writer = new FileWriter(savePath.toFile());
			writer.write(player.getDeck().toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
		
}
