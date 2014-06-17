package lesson140529;

public class ThreadExamples {

	private static final class Task implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().toString());
		}
	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().toString());

		new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().toString());
			};
		}.start();

		new Thread(new Task()).start();
				
	}

}
