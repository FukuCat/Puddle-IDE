package jGame.model.input;

public class Input {

	private AbstractMouse mouse;
	private AbstractKeyboard keyboard;
	private AbstractJoystickManager joystickManager;
	
	public Input(){
		setMouse(null);
		setKeyboard(null);
		setJoystickManager(null);
	}
	
	public Input(AbstractMouse mouse, AbstractKeyboard keyboard, AbstractJoystickManager joystickManager){
		setMouse(mouse);
		setKeyboard(keyboard);
		setJoystickManager(joystickManager);
	}
	
	public Input(AbstractMouse mouse, AbstractKeyboard keyboard){
		setMouse(mouse);
		setKeyboard(keyboard);
		setJoystickManager(null);
	}
	
	public Input(AbstractKeyboard keyboard){
		setMouse(null);
		setKeyboard(keyboard);
		setJoystickManager(null);
	}
	
	public Input(AbstractJoystickManager joystickManager){
		setMouse(null);
		setKeyboard(null);
		setJoystickManager(joystickManager);
	}
	
	public void setInput(AbstractMouse mouse, AbstractKeyboard keyboard, AbstractJoystickManager joystickManager){
		setMouse(mouse);
		setKeyboard(keyboard);
		setJoystickManager(joystickManager);
	}
	
	public enum InputType {
		// keyboard
		KEY_PRESS, KEY_RELEASE, KEY_TYPED,
		// mouse
		MOUSE_CLICKED, MOUSE_ENTERED, MOUSE_EXITED, MOUSE_PRESSED, MOUSE_RELEASED,
		// joystick
		JOY_PRESS, JOY_RELEASE
	}
	
	public void pollInput(){
		if(mouse != null)
			mouse.pollInput();
		if(keyboard != null)
			keyboard.pollInput();
		if(joystickManager != null)
			joystickManager.pollInput();
	}

	public void addJoystick(AbstractJoystick joystick){
		if(joystickManager != null)
			joystickManager.addJoystick(joystick);
	}
	
	public void removeJoystick(int index){
		if(joystickManager != null)
			joystickManager.removeJoystick(index);
	}
	
	public boolean getJoystickButton(int joystick, int button){
		return joystickManager.getButton(joystick, button);
	}
	
	public int getJoystickCount(){
		return joystickManager.getTotalConnections();
	}
	
	public boolean getKeyboardKey(int key){
		return keyboard.isPressed(key);
	}
	
	public double getMouseX(){
		return mouse.getX();
	}
	
	public double getMouseY(){
		return mouse.getY();
	}
	
	public boolean getMouseButton(int button){
		return mouse.isPressed(button);
	}
	
	public float getJoystickAxis(int joystick, int axis){
		return joystickManager.getAxis(joystick, axis);
	}
	
	public AbstractMouse getMouse() {
		return mouse;
	}

	public void setMouse(AbstractMouse mouse) {
		this.mouse = mouse;
	}

	public AbstractKeyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(AbstractKeyboard keyboard) {
		this.keyboard = keyboard;
	}

	public AbstractJoystickManager getJoystickManager() {
		return joystickManager;
	}

	public void setJoystickManager(AbstractJoystickManager joystickManager) {
		this.joystickManager = joystickManager;
	}
	
}
