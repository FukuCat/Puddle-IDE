package jGame.model.math;

public class Vector2f {
	

	private float[] array = new float[2];
	

	public Vector2f(){
		array[0] = array[1] = 0.0f;
	}
	
	public Vector2f(float x, float y) {
		this.array[0] = x;
		this.array[1] = y;
	}
	
	public void incValue(float x, float y){
		setX(getX() + x);
		setY(getY() + y);
	}
	
	public void setValue(float x, float y){
		setX(x);
		setY(y);
	}
	public Vector2f getValue(){return this;}

	public float getX(){return array[0];}
	public float getY(){return array[1];}

	public void setX(float x){this.array[0] = x;}
	public void setY(float y){this.array[1] = y;}
}
