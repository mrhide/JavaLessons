package lesson140624;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

import lesson140529.Utils;

public class ExchangerTest {

	static String meal;

	private static LinkedBlockingQueue<String> lbq = new LinkedBlockingQueue<String>();

	static String[] menu = { "Steak", "Pasta", "IceCream", "Soup" };

	static class Cook implements Runnable {

		@Override
		public void run() {
			Random random = new Random();
			while (true) {
				int pause = 1000 + random.nextInt(1000);
				Utils.pause(pause);
				String readyMeal = menu[random.nextInt(menu.length)];
				System.out.println("Cook: " + readyMeal);
				meal = readyMeal;
				try {
					lbq.put(meal);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}

	static class Waiter implements Runnable {

		@Override
		public void run() {
			while (true) {
				String readyMeal = null;
				try {
					readyMeal = lbq.take();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Waiter got: " + readyMeal);
			}
		}

	}

	public static void main(String[] args) {
		new Thread(new Cook()).start();
		new Thread(new Waiter()).start();
	}

}
