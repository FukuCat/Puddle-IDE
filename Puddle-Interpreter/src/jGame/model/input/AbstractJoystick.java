package jGame.model.input;

public abstract class AbstractJoystick implements AbstractInput {
	
	public void pollInput(){
		pollButtons();
		pollAxis();
	}
	public abstract void pollButtons();
	public abstract void pollAxis();
	public abstract boolean isDetached();
	
	public abstract boolean getButton(int button);
	public abstract float getAxis(int axis);
}
