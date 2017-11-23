package org.kon.jgame.view;

import org.kon.jgame.model.game.GameScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Renderer {
	
	private GameScreen gameScreen;
	private BufferedImage bufferedImage;
	private Graphics2D rendIn;
	private RenderingHints rh;
	
	public Renderer(GameScreen gameScreen){
		setGameScreen(gameScreen);
		setBufferedImage(BufferedImage.TYPE_INT_ARGB);
		setGraphics2D();
		rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		rendIn.setRenderingHints(rh);
	}

	public void clear() {
		rendIn.setColor(Color.WHITE);
		rendIn.fillRect(0, 0, gameScreen.getWidth(), gameScreen.getHeight());
	}
	
	public void render(JPanel parent){
		Graphics rendOut = parent.getGraphics();
		rendOut.drawImage(getBufferedImage(), 0, 0, null);
		rendOut.dispose();
	}

	public BufferedImage getBufferedImage() {
		return bufferedImage;
	}

	public void setBufferedImage(int TYPE) {
		bufferedImage = null;
		bufferedImage = new BufferedImage(gameScreen.getWidth(), gameScreen.getHeight(), TYPE);
	}

	public Graphics2D getRendIn() {
		return rendIn;
	}

	public void setGraphics2D() {
		if(getBufferedImage() != null)
			rendIn = (Graphics2D) getBufferedImage().getGraphics();
		else
			System.err.println("Cannot initialize Graphics 2D!");
	}

	public GameScreen getGameScreen() {
		return gameScreen;
	}

	public void setGameScreen(GameScreen gameScreen) {
		this.gameScreen = gameScreen;
	}
	
}
