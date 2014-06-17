package lesson140529;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadAndExceptions {

	public static void main(String[] args) {
		System.out.println("start");
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(true){
					System.out.println(Thread.currentThread().getName());
					Utils.pause(1000);
				}
			}}).start();
		
		Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread arg0, Throwable arg1) {
				System.out.println("bad exception caught!");
			}
		});
		
		if(args.length == 0) {
			throw new RuntimeException();
		}
		
		System.out.println("finish");
	}
}
