package jGame.model.math;


public class Vector2i {

	private int[] vec;
	
	public Vector2i(){ 
		vec = new int[2]; 
		vec[0] = 0;
		vec[1] = 0;
		}
	public Vector2i(int x, int y){
		vec = new int[2];
		vec[0] = x;
		vec[1] = y;
	}
	
	public void setX(int x){ vec[0] = x;}
	public void setY(int y){ vec[1] = y;}
	
	public int getX(){ return vec[0]; }
	public int getY(){ return vec[1]; }

	public boolean equals(Vector2i vector){
		return vec[0] == vector.getX() && vec[1] == vector.getY();
	}
	
}
