package org.kon.jgame.model.math;

public class Vector2f {
	

	private float[] array = new float[2];
	

	public Vector2f(){
		array[0] = array[1] = 0.0f;
	}

	public Vector2f(Vector2f vector){
		this.array[0] = vector.getX();
		this.array[1] = vector.getY();
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

    public void setValue(Vector2f vector){
        this.array[0] = vector.getX();
        this.array[1] = vector.getY();
    }

	public Vector2f getValue(){return new Vector2f(array[0],array[1]);}

	public float getX(){return array[0];}
	public float getY(){return array[1];}

	public void setX(float x){this.array[0] = x;}
	public void setY(float y){this.array[1] = y;}
}
