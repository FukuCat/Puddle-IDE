package org.kon.jgame.model.game;

import org.kon.jgame.model.math.Vector2f;
import org.kon.jgame.model.physics.Physics2D;

public abstract class GameActor extends Physics2D implements GameObject {
    protected Vector2f scale;
    public GameActor(){
        this.scale = new Vector2f();
    }
    public Vector2f getScale(){return scale;}
    public void setScale(Vector2f vector){
        this.scale.setValue(vector);
    }
    public void setScale(float x, float y){
        this.scale.setValue(x, y);
    }
}
