package lesson140619;

import java.util.concurrent.Executor;

public class ExecutorExamples {

	static class DirectExecutor implements Executor {

		@Override
		public void execute(Runnable r) {
			r.run();
		}

	}

	static class Task implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}

	static class ThreadPerTaskExecutor implements Executor {
		public void execute(Runnable r) {
			new Thread(r).start();
		}
	}

	public static void main(String[] args) {
		DirectExecutor directExecutor = new DirectExecutor();
		directExecutor.execute(new Task());

		ThreadPerTaskExecutor threadPerTaskExecutor = new ThreadPerTaskExecutor();
		
		threadPerTaskExecutor.execute(new Task());
		threadPerTaskExecutor.execute(new Task());
	}

}
