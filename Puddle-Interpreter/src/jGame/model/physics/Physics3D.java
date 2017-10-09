package jGame.model.physics;

import jGame.model.math.Vector3f;

public class Physics3D {

	protected Vector3f position;
	protected Vector3f rotation;
	protected Vector3f acceleration;
	protected Vector3f velocity;
	
	public Physics3D(){
		this.position = new Vector3f();
		this.rotation = new Vector3f();
		this.acceleration = new Vector3f();
		this.velocity = new Vector3f();
	}
	
	public Vector3f getPosition(){return position;}
	public void setPosition(float x, float y, float z){
		this.position.setValue(x, y, z);
		}
	public Vector3f getRotation(){return rotation;}
	public void setRotation(float x, float y, float z){
		this.rotation.setValue(x, y, z);
		}
	public Vector3f getAcceleration(){return acceleration;}
	public void setAcceleration(float x, float y, float z){
		this.acceleration.setValue(x, y, z);
		}
	public Vector3f getVelocity(){return velocity;}
	public void setVelocity(float x, float y, float z){
		this.velocity.setValue(x, y, z);
		}

}
