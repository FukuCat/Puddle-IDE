package jGame.model.physics;

import jGame.model.math.Vector2f;

public class Physics2D {

    protected Vector2f position;
    protected Vector2f rotation;
    protected Vector2f acceleration;
    protected Vector2f velocity;

    public Physics2D(){
        this.position = new Vector2f();
        this.rotation = new Vector2f();
        this.acceleration = new Vector2f();
        this.velocity = new Vector2f();
    }

    public Vector2f getPosition(){return position;}
    public void setPosition(float x, float y){
        this.position.setValue(x, y);
    }
    public Vector2f getRotation(){return rotation;}
    public void setRotation(float x, float y){
        this.rotation.setValue(x, y);
    }
    public Vector2f getAcceleration(){return acceleration;}
    public void setAcceleration(float x, float y){
        this.acceleration.setValue(x, y);
    }
    public Vector2f getVelocity(){return velocity;}
    public void setVelocity(float x, float y){
        this.velocity.setValue(x, y);
    }

}
