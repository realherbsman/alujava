package alujava.lesson06;

public class Config {

	public static final String SAVE_PATH = "savePath";
	public static final String PLAYER_COUNT = "playerCount";
	
	private String savePath;
	private int playerCount;
	
	public Config() {
		
	}
	
	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

}
