package org.kon.jgame.model.game;

import org.kon.jgame.model.graphics.Camera;
import org.kon.jgame.model.input.Input;
import org.kon.jgame.view.Renderer;

public interface GameObject {

	public void reset();
	public abstract void input(Input input, long deltaTime, Camera camera);
	public abstract void logic(long deltaTime);
	public abstract void render(Renderer renderer, Camera camera);
	public void close();
}
