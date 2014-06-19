package lesson140610;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import lesson140529.Utils;

public class ThreadFactoryExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool(new ThreadFactory() {
			@Override
			public Thread newThread(Runnable r) {
				Thread thread = new Thread(r, "My Thread");
				thread.setDaemon(true);
				thread.setPriority(1);
				return thread;
			}
		});

		service.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread());
			}
		});
		
		Utils.pause(1000);
	}

}
