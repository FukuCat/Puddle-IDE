package jGame.model.game;

import jGame.model.graphics.Camera;
import jGame.model.input.Input;
import jGame.view.Renderer;

public interface GameObject {

	public void reset();
	public abstract void input(Input input, long deltaTime, Camera camera);
	public abstract void logic(long deltaTime);
	public abstract void render(Renderer renderer, Camera camera);
	public void close();
}
