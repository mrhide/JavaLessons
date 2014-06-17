package lesson140603;

public class Counter {

	private int counter;

	public void inc() {
		synchronized (this) { // mutex
			// mutual exclusion - взаимное исключение (блокировка)
			counter++;
			System.out.println(Thread.currentThread().getName() + ": "
					+ counter);
		}
	}

	public void mul() {
		synchronized (this) {
			counter *= 2;
		}
	}

	public int get() {
		return counter;
	}

}
