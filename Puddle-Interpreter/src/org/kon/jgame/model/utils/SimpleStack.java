package org.kon.jgame.model.utils;

import java.util.LinkedList;

public class SimpleStack<T> {
	private LinkedList<T> stack;
	private int size;

	public SimpleStack(){
		setStack(new LinkedList<T>());
		size = 0;
	}

	public void clear(){
		stack.clear();
		size = 0;
	}

	// stack operations
		
	public T push(T value){
		stack.add(0,value);
		size++;
		return value;
	}
		
	public T pop(){
		T result = stack.poll();
		if(result != null)
			size--;

		return result;
	}
		
	public T peek(){
			return stack.peek();
		}
		
	public boolean isEmpty(){
			return stack.isEmpty();
		}

	public void reverse(){
		SimpleStack<T> temp = new SimpleStack<>();
		while(!stack.isEmpty()){
			temp.push(pop());
		}
		setStack(temp.getStack());
	}

	// other

	public T[] toArray(){
		return (T[]) stack.toArray();
	}

	public LinkedList<T> getStack() {
			return stack;
		}

	public void setStack(LinkedList<T> stack) {
			this.stack = stack;
		}

	public int getSize() {
			return size;
		}
}
