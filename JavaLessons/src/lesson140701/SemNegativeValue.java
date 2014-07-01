package lesson140701;

import java.util.concurrent.Semaphore;

import lesson140529.Utils;

public class SemNegativeValue {
	
	public static void main(String[] args) {
		
		final Semaphore sem = new Semaphore(-2);
		new Thread(new Runnable() {
			@Override
			public void run() {
				sem.acquireUninterruptibly();
				System.out.println("hello there!");
			}			
		}).start();
		System.out.println("---");
		
		Utils.pause(1000);
		System.out.println("на старт");
		sem.release();
		Utils.pause(1000);
		System.out.println("внимание");
		sem.release();
		Utils.pause(1000);
		System.out.println("марш!");
		sem.release();
		
	}
}
