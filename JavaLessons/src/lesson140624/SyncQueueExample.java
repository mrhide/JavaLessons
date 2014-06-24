package lesson140624;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

import lesson140529.Utils;

public class SyncQueueExample {

	public static void main(String[] args) {
		
		final BlockingQueue<String> queue = new SynchronousQueue<>();
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		service.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Creating thing");
//				Utils.pause(10000);
				System.out.println("Thing is ready");
				try {
					queue.put("THING");
					System.out.println("Thing is passed");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		service.execute(new Runnable() {			
			@Override
			public void run() {
				System.out.println("doing some other stuff");
				Utils.pause(10000);
				System.out.println("waiting for thing");
				try {
					String thing = queue.take();
					System.out.println("got " + thing);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
}
