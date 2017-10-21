package view.jGame.model.input;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse extends AbstractMouse implements MouseListener, MouseMotionListener{

	private boolean[] mouseMap;
	private int[] mouseCoords;
	private int numOfMouseButtons;
	private JPanel parent;

	public Mouse(JPanel parent){
		numOfMouseButtons = MouseInfo.getNumberOfButtons();
		setMouseMap(new boolean[numOfMouseButtons + 1]);
		setMouseCoords(new int[2]);
		setParent(parent);
	}
	
	@Override
	public void pollButtons() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pollMove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getX() {
		return mouseCoords[0];
	}

	@Override
	public double getY() {
		return mouseCoords[1];
	}

	@Override
	public boolean isPressed(int button) {
		if(button < 0 || button > numOfMouseButtons)
			return false;
		return mouseMap[button];
	}
	
	private void setMouseCoords(int x, int y){
		mouseCoords[0] = x;
		mouseCoords[1] = y;
	}
	
	private void setMouseButton(int button, boolean value){
		if(!(button < 0 || button > numOfMouseButtons))
			mouseMap[button] = value;
	}

	// mouse listener
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		parent.setFocusable(true);
		parent.requestFocus();
		setMouseButton(arg0.getButton(), true);
		setMouseCoords(arg0.getX(), arg0.getY());
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		parent.setFocusable(true);
		parent.requestFocus();
		setMouseButton(arg0.getButton(), false);
		setMouseCoords(arg0.getX(), arg0.getY());
		
	}

	public boolean[] getMouseMap() {
		return mouseMap;
	}

	public void setMouseMap(boolean[] mouseMap) {
		this.mouseMap = mouseMap;
	}

	public int[] getMouseCoords() {
		return mouseCoords;
	}

	public void setMouseCoords(int[] mouseCoords) {
		this.mouseCoords = mouseCoords;
	}

	public int getNumOfMouseButtons() {
		return numOfMouseButtons;
	}

	public void setNumOfMouseButtons(int numOfMouseButtons) {
		this.numOfMouseButtons = numOfMouseButtons;
	}

	public JPanel getParent() {
		return parent;
	}

	public void setParent(JPanel parent) {
		this.parent = parent;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		setMouseCoords(arg0.getX(), arg0.getY());
	}

}
