package lesson140624;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

	private static ScheduledExecutorService service;
	private static ScheduledFuture<?> timeoutFuture;
	private static ScheduledFuture<?> countdownFuture;

	static class CountdownAction implements Runnable {
		
		private int _countdown;
		private ScheduledFuture<?> _scheduledFuture;

		public void setScheduledFuture(ScheduledFuture<?> scheduledFuture) {
			_scheduledFuture = scheduledFuture;
		}

		public CountdownAction(int seconds) {
			_countdown = seconds;
		}
		
		@Override
		public void run() {
			System.out.println("Time left " + (_countdown--));
			if(_countdown == 0) {
				_scheduledFuture.cancel(true);
			}
		}		
	}
	
	static class TimeoutAction implements Runnable {
		@Override
		public void run() {
			System.out.println("Timeout! Try again.");
			resetActions();
		}
	}
	
	public static void main(String[] args) {
		service = Executors.newSingleThreadScheduledExecutor();
		
		resetActions();
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
			resetActions();
		}
	}

	public static void resetActions() {
		
		if(timeoutFuture != null) {
			timeoutFuture.cancel(true);
		}
		if(countdownFuture != null) {
			countdownFuture.cancel(true);
		}
		
		timeoutFuture = service.schedule(new TimeoutAction(), 10, TimeUnit.SECONDS);
		
		CountdownAction countdownAction = new CountdownAction(10);
		countdownFuture = service.scheduleAtFixedRate(countdownAction, 1, 1, TimeUnit.SECONDS);
		countdownAction.setScheduledFuture(countdownFuture);
	}
	
}
