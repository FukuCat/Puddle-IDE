package org.kon.jgame.demo.actor;

import org.kon.jgame.model.game.GameActor;
import org.kon.jgame.model.graphics.Camera;
import org.kon.jgame.model.input.Input;
import org.kon.jgame.model.input.Mouse;
import org.kon.jgame.model.math.Vector2f;
import org.kon.jgame.view.Renderer;

import java.awt.*;

public class BoxActor extends GameActor {

    private static final int SIZE = 50;
    private static final Color PRESSED = Color.BLUE;
    private static final Color RELEASED = Color.CYAN;

    private Color color;

    public BoxActor(){
        super();
        reset();
    }

    @Override
    public void reset() {
        setPosition(new Vector2f());
        setScale(SIZE,SIZE);
        color = RELEASED;
    }

    @Override
    public void input(Input input, long deltaTime, Camera camera) {
        if(input.getMouse().isPressed(Mouse.LEFT_BUTTON))
            color = PRESSED;
        else if(color != RELEASED)
            color = RELEASED;
        setPosition((float)input.getMouseX(),(float)input.getMouseY());
    }

    @Override
    public void logic(long deltaTime) {

    }

    @Override
    public void render(Renderer renderer, Camera camera) {
        renderer.getRendIn().setStroke(new BasicStroke(2));
        renderer.getRendIn().setColor(color.brighter());
        renderer.getRendIn().drawRect((int)position.getX() - (int)scale.getX()/2,
                (int)position.getY() - (int)scale.getY()/2,
                (int)scale.getX(), (int)scale.getY());
        renderer.getRendIn().setColor(color);
        renderer.getRendIn().fillRect((int)position.getX() - (int)scale.getX()/2,
                (int)position.getY() - (int)scale.getY()/2,
                (int)scale.getX(), (int)scale.getY());
    }

    @Override
    public void close() {

    }
}
