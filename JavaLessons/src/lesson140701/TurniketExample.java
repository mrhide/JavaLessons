package lesson140701;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import lesson140529.Utils;

public class TurniketExample {

	static AtomicInteger counter = new AtomicInteger();
	
	static class Turniket implements Runnable {

		@Override
		public void run() {
			Random random = new Random();
			while(true) {
//				Utils.pause(2000 + random.nextInt(3000));
				Utils.pause(2000);
				
//				int tmp = counter;
//				int tmp2 = tmp + 1;
//				counter = tmp2;

				int currentValue = counter.incrementAndGet();
				
				System.out.println(Thread.currentThread().getName() + ": " + counter);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 8; i++) {
			new Thread(new Turniket()).start();			
		}
		
	}
	
}
