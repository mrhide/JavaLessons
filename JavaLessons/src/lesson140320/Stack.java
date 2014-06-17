package lesson140320;

import java.util.ArrayList;

public class Stack extends ArrayList {
	
	public Object top() {
		if(isEmpty()) {
			return null;
		}
		return get(size() - 1);
	}
	
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		return remove(size() - 1);
	}
	
	public void push(Object item) {
		super.add(item);
	}
	
	@Override
	public boolean add(Object e) {
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		
		while(stack.top() != null) {
			System.out.println(stack.pop());
		}
	}
	
}
