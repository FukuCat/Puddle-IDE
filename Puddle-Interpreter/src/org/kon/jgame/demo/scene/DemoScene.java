package org.kon.jgame.demo.scene;

import org.kon.jgame.demo.actor.BoxActor;
import org.kon.jgame.model.game.GameObject;
import org.kon.jgame.model.game.GameScene;
import org.kon.jgame.model.graphics.Camera;
import org.kon.jgame.model.input.Input;
import org.kon.jgame.view.Renderer;

public class DemoScene extends GameScene {

    Camera camera;

    public DemoScene(String name) {
        super(name);
        init();
    }

    @Override
    public void init() {
        camera = new Camera();
        actors.clear();
        actors.add(new BoxActor());
        setDoneLoading(true);
    }

    @Override
    public void input(Input input, long deltaTime) {
        for(GameObject o : getActors())
            o.input(input, deltaTime, camera);
    }

    @Override
    public void logic(long deltaTime) {
        camera.logic(deltaTime);
        for(GameObject o : getActors())
            o.logic(deltaTime);
    }

    @Override
    public void render(Renderer renderer) {
        for(GameObject o : getActors())
            o.render(renderer, camera);
    }

    @Override
    public void close() {
        for(GameObject o : getActors())
            o.close();
        setDoneLoading(false);
    }
}
