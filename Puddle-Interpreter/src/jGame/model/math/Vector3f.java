package jGame.model.math;

public class Vector3f {
	
	private float[] array = new float[3];
	

	public Vector3f(){
		array[0] = array[1] = array[2] = 0.0f;
	}
	
	public Vector3f(float value){
		setX(value);
		setY(value);
		setZ(value);
	}
	
	public Vector3f(float x, float y) {
		setX(x);
		setY(y);
		setZ(0.0f);
	}
	
	public Vector3f(float x, float y, float z) {
		setValue(x, y, z);
	}
	
	public void setValue(Vector3f v) {
		setX(v.getX());
		setY(v.getY());
		setZ(v.getZ());
	}
	
	public void setValue(float x, float y, float z) {
		setX(x);
		setY(y);
		setZ(z);
	}
	
	public Vector3f multiply(float value){
		return new Vector3f(getX() * value, getY() * value, getZ() * value);
	}
	
	public void incValue(Vector3f v) {
		setX(getX() + v.getX());
		setY(getY() + v.getY());
		setZ(getZ() + v.getZ());
	}
	
	public void incValue(float x, float y, float z) {
		setX(getX() + x);
		setY(getY() + y);
		setZ(getZ() + z);
	}
	
	public Vector3f invert(){
		return new Vector3f(-array[0], -array[1], -array[2]);
	}
	
	public Vector3f incValue(Vector2f v2){
		return new Vector3f(getX() + v2.getX(), getY() + v2.getY(), getZ());
	}
	
	public Vector3f getValue(){return this;}
	
	public void incX(float x){this.array[0] = getX() + x;}
	public void incY(float y){this.array[1] = getY() + y;}
	public void incZ(float z){this.array[2] = getZ() + z;}
	
	public float getX(){return array[0];}
	public float getY(){return array[1];}
	public float getZ(){return array[2];}

	public void setX(float x){this.array[0] = x;}
	public void setY(float y){this.array[1] = y;}
	public void setZ(float z){this.array[2] = z;}
}
