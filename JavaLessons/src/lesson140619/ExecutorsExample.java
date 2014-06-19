package lesson140619;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import lesson140529.Utils;

public class ExecutorsExample {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();

		service.execute(new Task());
		service.execute(new Task());
		
//		service.shutdown();
		try {
			service.awaitTermination(1, TimeUnit.HOURS);
			System.out.println("Finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static final class Task implements Runnable {
		@Override
		public void run() {
			System.out.println("hello from " + Thread.currentThread());
			Utils.pause(5000);
			System.out.println("bye from " + Thread.currentThread());
		}

	}

}
