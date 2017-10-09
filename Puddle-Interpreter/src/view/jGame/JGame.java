package view.jGame;

import jGame.model.game.GameEngine;
import jGame.model.game.GameScene;
import jGame.model.game.GameSceneManager;
import jGame.model.game.GameScreen;
import jGame.model.input.Input;
import jGame.model.input.Keyboard;
import jGame.model.input.Mouse;
import jGame.view.Renderer;

import javax.swing.*;
import java.awt.*;

public class JGame extends JPanel implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5122544045958557520L;

	private Thread thread;
	
	// Controllers
	private Input input;
	
	// Timer
	private long deltaTime;
	private long variableYieldTime, lastTime, startTime, prevTime;
	private int aveFPS;
	
	// window variables
	private GameScreen screen;
	
	// Engine
	private Renderer renderer;
	private GameEngine engine;
	
	public JGame(String title, int width, int height, int fps, GameSceneManager sceneManager){
		// SWING
		super();
		setPreferredSize(new Dimension(width, height));
		
		setScreen(new GameScreen(title, width, height, fps, true));
		setInput(new Input(new Mouse(this), new Keyboard(this)));
		setRenderer(new Renderer(screen));
		setEngine(new GameEngine(input, sceneManager));
	}
	
	public void addNotify(){
		super.addNotify();
		if(thread == null){
			thread = new Thread(this, screen.getTitle() +" - Thread");
			thread.start();
		}
		addKeyListener((Keyboard)input.getKeyboard());
		addMouseListener((Mouse)input.getMouse());
		setFocusable(true);
		requestFocus();
	}
	
	private void init(){
		lastTime = prevTime = startTime = System.nanoTime();
		aveFPS = 0;
	}
	
	@Override
	public void run() {
		init();
		do{
			input(); //Get Input from the user
			update(); // update game status
			render(); // render stuff
			fps(); // FPS

		}while(getScreen().isRunning());
		engine.close();
		System.exit(0);
	}
	
	private void input() {
		input.pollInput();
	}
	
	private void update() {
		engine.update(deltaTime);
	}
	
	protected void render() {
		renderer.clear();
		engine.render(renderer);
		renderer.render(this);
	}
	
	private void fps(){
		deltaTime = System.nanoTime() - lastTime;
		if (getScreen().getFps() <= 0){
			System.err.println("Invalid FPS!");
			getScreen().setRunning(false);
			return;
		}
		
		long sleepTime = 1000000000 / getScreen().getFps(); 
		long yieldTime = Math.min(sleepTime, variableYieldTime + sleepTime % (1000 * 1000));
		long overSleep = 0; 
	          
		try {
	    	while (true) {
	        	long t = System.nanoTime() - lastTime;
	                  
	        	if (t < sleepTime - yieldTime) {
	                    Thread.sleep(1);
	        	}else if (t < sleepTime) {
	                    Thread.yield();
	        	}else {
	            	overSleep = t - sleepTime;
	            	break; 
	         	}
	    	}
		} catch (InterruptedException e) {
	    	 e.printStackTrace();
		}finally{
	    	lastTime = System.nanoTime() - Math.min(overSleep, sleepTime);
	    	if (overSleep > variableYieldTime) {
	        	variableYieldTime = Math.min(variableYieldTime + 200*1000, sleepTime);
	        } else if (overSleep < variableYieldTime - 200*1000) {
	        	variableYieldTime = Math.max(variableYieldTime - 2*1000, 0);
	        }
	    }
	    //calculateFPS();
	}

	private void calculateFPS(){
		aveFPS++;
		//System.out.println("now: "+ glfwGetTime());
		//System.out.println("last: "+ lastTime);
		long tempTime = System.nanoTime();
		if( (tempTime - prevTime) / 1000000000.0f >= 1.0f ){
			if(true){
				System.out.println("[FPS]");
				System.out.println("Time:           " + ((prevTime - startTime) / 1000000000.0f));
				System.out.println("Millisec/Frame: " + deltaTime);
				System.out.println("Average FPS:    " + aveFPS);
			}
			aveFPS = 0;
			prevTime = tempTime;
		}
	}
	
	public void initialGameScene(String sceneName){engine.getGameSceneManager().changeScene(sceneName);}
	public void registerGameScene(GameScene scene){ engine.getGameSceneManager().addScene(scene); }
	
	public GameSceneManager getGameSceneManager(){return engine.getGameSceneManager();}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public long getDeltaTime() {
		return deltaTime;
	}

	public void setDeltaTime(long deltaTime) {
		this.deltaTime = deltaTime;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public GameEngine getEngine() {
		return engine;
	}

	public void setEngine(GameEngine engine) {
		this.engine = engine;
	}

	public Renderer getRenderer() {
		return renderer;
	}

	public void setRenderer(Renderer renderer) {
		this.renderer = renderer;
	}

	public GameScreen getScreen() {
		return screen;
	}

	public void setScreen(GameScreen screen) {
		this.screen = screen;
	}

	public String getTitle() {
		return screen.getTitle();
	}
	
	public int getWidth(){
		return screen.getWidth();
	}
	
	public int getHeight(){
		return screen.getHeight();
	}


}
