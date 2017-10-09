package jGame.model.input;

import java.util.ArrayList;

public abstract class AbstractJoystickManager implements AbstractInput{

	private int maxConnections;
	private boolean notify;
	private ArrayList<AbstractJoystick> joysticks;
	
	public AbstractJoystickManager(int maxConnections){
		setJoysticks(new ArrayList<>());
		setNotify(true);
		setMaxConnections(maxConnections);
	}
	
	public void addJoystick(AbstractJoystick joystick){
		joysticks.add(joystick);
	}
	public void removeJoystick(int index){
		joysticks.remove(index);
	}

	public int getTotalConnections() {
		return joysticks.size();
	}
	
	public abstract void initialize();
	public abstract void checkConnection();
	public void pollInput(){
		for(AbstractJoystick j: joysticks)
			if(!j.isDetached())
				j.pollInput();
	}
	
	public boolean getButton(int joystick, int button){
		return joysticks.get(joystick).isDetached() ? false : joysticks.get(joystick).getButton(button);
	}
	
	public float getAxis(int joystick, int axis){
		return joysticks.get(joystick).isDetached() ? 0.0f : joysticks.get(joystick).getAxis(axis);
	}
	
	public AbstractJoystick getJoystick(int index){
		return joysticks.get(index);
	}

	public ArrayList<AbstractJoystick> getJoysticks() {
		return joysticks;
	}

	public void setJoysticks(ArrayList<AbstractJoystick> joysticks) {
		this.joysticks = joysticks;
	}

	public boolean isNotify() {
		return notify;
	}

	public void setNotify(boolean notify) {
		this.notify = notify;
	}

	public int getMaxConnections() {
		return maxConnections;
	}

	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}
}
