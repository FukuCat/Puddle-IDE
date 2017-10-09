package jGame.model.game;

import jGame.model.input.Input;
import jGame.view.Renderer;

public class GameEngine {
	// Controllers
	private Input input;
	private GameSceneManager gameSceneManager;
	
	public GameEngine(Input input, GameSceneManager gameSceneManager){
		setInput(input);
		setGameSceneManager(gameSceneManager);
	}

	public void update(long deltaTime){
		if(gameSceneManager.getCurrentScene().isDoneLoading()){
			gameSceneManager.getCurrentScene().input(input, deltaTime);
			gameSceneManager.getCurrentScene().logic(deltaTime);
		}
	}
	
	public void render(Renderer renderer){
		if(gameSceneManager.getCurrentScene().isDoneLoading())
			gameSceneManager.getCurrentScene().render(renderer);
	}
	
	public void close(){
		gameSceneManager.close();
	}
	
	
	
	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public GameSceneManager getGameSceneManager() {
		return gameSceneManager;
	}

	public void setGameSceneManager(GameSceneManager gameSceneManager) {
		this.gameSceneManager = gameSceneManager;
	}

}
