package lesson140603;

import lesson140529.Utils;

public class VisibilityExample {

	static class Task implements Runnable {

		private boolean stop;
		
		synchronized public boolean isStopped() {
			return stop;
		}
		
		@Override
		public void run() {
			long counter = 0;
			while(!isStopped()) {
				counter++;
			}
			System.out.println(counter);
		}
		
		synchronized public void stop() {
			stop = true;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		Task task = new Task();
		new Thread(task).start();
		Utils.pause(10000);
		task.stop();
	}
	
}
