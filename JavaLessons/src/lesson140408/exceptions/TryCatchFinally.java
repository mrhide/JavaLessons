package lesson140408.exceptions;

import java.util.Random;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int a = 0;
		System.out.println("a = " + a);
		
		try {
			a = 10;
			System.out.println("a = " + a);
			doSomething();
			System.out.println("a = " + a);
		} catch (RuntimeException e) { // сначала ловим более специализированные случаи,
			System.out.println("runtime");
			a = 20;
			System.out.println("a = " + a);
		} catch (Exception e) { // затем более общие
			System.out.println("exception");
			a = 25;
			System.out.println("a = " + a);
		} finally { // этот блок выполнится в любом случае
			a = 30;
			System.out.println("a = " + a);
		}
		
		System.out.println("a = " + a);
		
	}

	private static void doSomething() throws Exception {
		Random r = new Random();
		if(r.nextInt(2) == 0) { // сгенерировать целое случайное число не более 2. 1 или 0
			throw new RuntimeException();		
		} else {
			throw new Exception();
		}
		
	}
	
}
