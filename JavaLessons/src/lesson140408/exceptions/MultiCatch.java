package lesson140408.exceptions;

import java.util.Random;

public class MultiCatch {

	static class My1 extends RuntimeException {
		public void precess1() {
			System.out.println("one");
		}
	}
	
	static class My2 extends RuntimeException {
		public void precess2() {
			System.out.println("two");
		}
	}
	
	public static void main(String[] args) {
			
		
		try {
			doSomething();
		} catch (My1 | My2 e) { // такое можно только в Java 7
			if(e instanceof My1) {
				((My1)e).precess1();
			} else {
				((My2)e).precess2();				
			}
			e.printStackTrace();
		}
		
	}

	private static void doSomething() {
		if(new Random().nextBoolean()) {
			throw new My1();
		} else {
			throw new My2();
		}
	}
	
}
