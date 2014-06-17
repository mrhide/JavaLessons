package lesson140617;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lesson140529.Utils;

public class TryLockExamples {

	static Lock mutex = new ReentrantLock();

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

		try {
			if (mutex.tryLock(2, TimeUnit.SECONDS)) {
				try {
					System.out.println("Hello there");
				} finally {
					mutex.unlock();
				}
			} else {
				System.out.println("timeout...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (mutex.tryLock()) {
			try {
				System.out.println("Hello there");
			} finally {
				mutex.unlock();
			}
		} else {
			System.out.println("mutex is busy...");
		}

	}

}
