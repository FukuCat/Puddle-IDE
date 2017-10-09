package jGame.model.game;

public class GameScreen {

	private String title;
	private int width, height, fps;
	private boolean isRunning;
	
	public GameScreen(String title, int width, int height, int fps, boolean isRunning) {
		this.width = width;
		this.height = height;
		this.fps = fps;
		this.isRunning = isRunning;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getFps() {
		return fps;
	}
	public void setFps(int fps) {
		this.fps = fps;
	}
	public boolean isRunning() {
		return isRunning;
	}
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
