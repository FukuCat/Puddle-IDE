package jGame.model.input;

public abstract class AbstractKeyboard implements AbstractInput {
	
	protected boolean[] keyMap;
	
	public void pollInput(){
		pollType();
		pollPress();
		pollRelease();
	}
	
	public abstract void pollPress();
	public abstract void pollRelease();
	public abstract void pollType();
	
	public abstract boolean isPressed(int key);
	
	public boolean[] getKeyMap(){return keyMap;}
	public void setKeyMap(boolean[] keyMap){this.keyMap = keyMap;}

}
