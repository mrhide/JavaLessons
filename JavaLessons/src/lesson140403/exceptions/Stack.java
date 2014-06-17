package lesson140403.exceptions;

public class Stack {
	
	Object[] items;
	int index = 0;
	
	public Stack(int maxsize) {
		items = new Object[maxsize];
	}
	
	public void push(Object item) throws StackOverflow {
		if(size() == items.length) {
			throw new StackOverflow();
		}
		items[index++] = item;
	}
	
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		return items[--index];
	}
	
	public Object top() {
		if(isEmpty()) {
			return null;
		}
		return items[index-1];
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return index;
	}
	
}
