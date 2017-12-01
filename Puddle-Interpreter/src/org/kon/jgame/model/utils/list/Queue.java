package org.kon.jgame.model.utils.list;

import java.util.LinkedList;

public class Queue<T> {
	private LinkedList<T> queue;
	private int size;
		
	public Queue(){
		setQueue(new LinkedList<T>());
		size = 0;
	}

	public void clear(){
		queue.clear();
		size = 0;
	}

	// queue operations
		
	public T enqueue(T value){
		if(queue.add(value)){
			size++;
			return value;}
		return null;
	}
		
	public T dequeue(){
		T result = queue.poll();
		if(result != null)
			size--;
		return result;
	}
		
	public T head(){
			return queue.peek();
		}
		
	public T tail(){
		T result = null;
		for (T temp : queue)
				result = temp;
		return result;
	}
		
	public boolean isEmpty(){
			return queue.isEmpty();
		}
		
	// other

	public T[] toArray(){
		return (T[]) queue.toArray();
	}

	public LinkedList<T> getQueue() {
			return queue;
		}

	public void setQueue(LinkedList<T> queue) {
			this.queue = queue;
		}
		
	// derived from normal queue functions
		
	public T rotate(){
		T temp = dequeue();
		if(temp != null)
			enqueue(temp);
		return temp;
	}

	public int getSize() {
			return size;
		}
}
