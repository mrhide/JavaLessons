package lesson140624;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lesson140529.Utils;

public class CountdownLatchExample {

	static class Runner implements Runnable {
		
		private CountDownLatch _latch;

		public Runner(CountDownLatch latch) {
			_latch = latch;
		}
		
		@Override
		public void run() {
			try {
				System.out.println(this + " is ready");
				_latch.await();
				System.out.println(this + "(" + Thread.currentThread().getName() + ") " + " has started at " + System.nanoTime());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		
		CountDownLatch latch = new CountDownLatch(3);
		
		service.execute(new Runner(latch));
		service.execute(new Runner(latch));
		service.execute(new Runner(latch));
		service.execute(new Runner(latch));
		
		System.out.println("---");
		
		Utils.pause(3000);
		
		System.out.println("�� �����!...");
		latch.countDown();
		Utils.pause(2000);
		System.out.println("��������!...");
		latch.countDown();
		Utils.pause(2000);
		System.out.println("����!");
		latch.countDown();
	}
	
}
