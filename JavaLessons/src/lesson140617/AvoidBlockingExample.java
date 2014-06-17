package lesson140617;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lesson140529.Utils;

public class AvoidBlockingExample {

	static final Lock mutex = new ReentrantLock();

	public static void main(String[] args) {

		System.out.println("start");

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("start heavy job");
				mutex.lock();
				try {
					while (true) {
					}
				} finally {
					mutex.unlock();
				}

			}
		}, "Heavy job").start();

		Utils.pause(1000);

		System.out.println("trying to lock mutex");

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					mutex.lockInterruptibly();
					try {
						System.out.println("hello there");
					} finally {
						mutex.unlock();
					}
				} catch (InterruptedException e) {
					System.out.println("we were interrupted!");
				}

			}
		}, "Second thread");

		thread.start();

		Utils.pause(1000);

		thread.interrupt();
		thread.stop();

	}

}