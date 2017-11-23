package org.kon.jgame.model.game;

import org.kon.jgame.controller.ExternalActionController;
import org.kon.jgame.model.external.ExternalAction;
import org.kon.jgame.model.input.Input;
import org.kon.jgame.model.timer.SimpleTimer;
import org.kon.jgame.view.Renderer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class GameScene {
	public static final String ACTION_RESET = "DEFAULT_RESET";
	public static final String ACTION_EMPTY = "";
	protected String name;
	protected ArrayList<GameObject> actors;
	protected GameSceneManager gameSceneManager;
	private GameScreen screen;
	protected boolean isDoneLoading;
	protected boolean isSceneEnded;
	private HashMap<Integer, SimpleTimer> inputTimers;
	// accessing from outside the jpanel
	private ConcurrentLinkedQueue<String> actionQueue;
	private HashMap<String, ExternalAction> externalActions;
	private ExternalActionController externalActionController;

	public GameScene(String name){
		setActors(new ArrayList<>());
		setName(name);
		setDoneLoading(true);
		setSceneEnded(true);
		setInputTimers(new HashMap<>());
		setExternalActions(new HashMap<>());
		setActionQueue(new ConcurrentLinkedQueue<>());
		setExternalActionController(new ExternalActionController(this));
		createDefaultExternalActions();
	}
	public GameScene(String name, boolean isDoneLoading){
	    setInputTimers(new HashMap<>());
		setActors(new ArrayList<>());
		setName(name);
		setDoneLoading(isDoneLoading);
		setSceneEnded(true);
		setExternalActions(new HashMap<>());
		setActionQueue(new ConcurrentLinkedQueue<>());
		setExternalActionController(new ExternalActionController(this));
		createDefaultExternalActions();
	}
	private void createDefaultExternalActions(){
		getExternalActions().put(ACTION_RESET, this::init);
	}
	// call loader and init vars -> set doneLoading to true
	public abstract void init();
	
	public abstract void input(Input input, long deltaTime);
	public abstract void logic(long deltaTime);
	public abstract void render(Renderer renderer);
	public abstract void close();

	public int getWindowWidth(){return screen.getWidth();}
	public int getWindowHeight(){return screen.getHeight();}

	public void doExternalAction(){
		String sAction = getActionQueue().poll();
		if(sAction != null) {
			ExternalAction a = getExternalActions().get(sAction);
			if (a != null)
				a.run();
			else
				System.err.println("No such action implemented: ["+sAction+"]");
		}
	}
	
	public ArrayList<GameObject> getActors() {
		return actors;
	}

	public void setActors(ArrayList<GameObject> actors) {
		this.actors = actors;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean isDoneLoading() {
		return isDoneLoading;
	}

	public void setDoneLoading(boolean isDoneLoading) {
		this.isDoneLoading = isDoneLoading;
	}

	public boolean isSceneEnded() {
		return isSceneEnded;
	}

	public void setSceneEnded(boolean isSceneEnded) {
		this.isSceneEnded = isSceneEnded;
	}
	public GameSceneManager getGameSceneManager() {
		return gameSceneManager;
	}
	public void setGameSceneManager(GameSceneManager gameSceneManager) {
		this.gameSceneManager = gameSceneManager;
	}

    public HashMap<Integer, SimpleTimer> getInputTimers() {
        return inputTimers;
    }

    public void setInputTimers(HashMap<Integer, SimpleTimer> inputTimers) {
        this.inputTimers = inputTimers;
    }

	public HashMap<String, ExternalAction> getExternalActions() {
		return externalActions;
	}

	public void setExternalActions(HashMap<String, ExternalAction> externalActions) {
		this.externalActions = externalActions;
	}

	public ConcurrentLinkedQueue<String> getActionQueue() {
		return actionQueue;
	}

	public void setActionQueue(ConcurrentLinkedQueue<String> actionQueue) {
		this.actionQueue = actionQueue;
	}

	public ExternalActionController getExternalActionController() {
		return externalActionController;
	}

	public void setExternalActionController(ExternalActionController externalActionController) {
		this.externalActionController = externalActionController;
	}

	public GameScreen getScreen() {
		return screen;
	}

	public void setScreen(GameScreen screen) {
		this.screen = screen;
	}
}
