package jGame.model.input;

public abstract class AbstractMouse implements AbstractInput {
	public void pollInput(){
		pollButtons();
		pollMove();
	}
	public abstract void pollButtons();
	public abstract void pollMove();
	
	public abstract double getX();
	
	public abstract double getY();
	
	public abstract boolean isPressed(int button);
}
