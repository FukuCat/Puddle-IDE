package org.kon.jgame.model.input;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard extends AbstractKeyboard implements KeyListener{

	private JPanel parent;
	
	public Keyboard(JPanel parent){
		setKeyMap(new boolean[KeyEvent.KEY_LAST + 1]);
		setParent(parent);
	}
	
	@Override
	public void pollPress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pollRelease() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pollType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPressed(int key) {
		if(key < 0 || key > KeyEvent.KEY_LAST)
			return false;
		return keyMap[key];
	}

	private void setKey(int key, boolean value){
		if(!(key < 0 || key > KeyEvent.KEY_LAST))
		keyMap[key] = value;
	}
	
	// key listener
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		setKey(arg0.getKeyCode(), true);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		setKey(arg0.getKeyCode(), false);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public JPanel getParent() {
		return parent;
	}

	public void setParent(JPanel parent) {
		this.parent = parent;
	}

}
