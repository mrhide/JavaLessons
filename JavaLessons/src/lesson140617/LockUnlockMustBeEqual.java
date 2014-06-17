package lesson140617;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lesson140529.Utils;

public class LockUnlockMustBeEqual {

	static ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				getLock();
				getLock();
				getLock();
				System.out.println("haha");
				Utils.pause(3000);
				System.out.println(lock.getHoldCount());
				System.out.println(lock.getQueueLength());
				freeLock();
				freeLock();
				freeLock();
			}

		}).start();

		Utils.pause(1000);
		
		lock.lock();
		try {
			System.out.println("hello there");
		} finally {
			lock.unlock();
		}
		
	}

	protected static void freeLock() {
		lock.unlock();
	}

	protected static void getLock() {
		lock.lock();
	}
}
