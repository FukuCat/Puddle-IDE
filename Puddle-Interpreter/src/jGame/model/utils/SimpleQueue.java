package jGame.model.utils;

import java.util.LinkedList;

public class SimpleQueue<T> {
	private LinkedList<T> queue;
	private int size;
		
		public SimpleQueue(){
			setQueue(new LinkedList<T>());
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
