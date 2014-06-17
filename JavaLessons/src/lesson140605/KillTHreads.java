package lesson140605;

import java.util.LinkedList;
import java.util.List;

import lesson140529.Utils;

public class KillTHreads {

	static class Car {
		String engine;
		String hull;
		String wheels;
		
		@Override
		public String toString() {
			return engine + ", " + hull + ", " + wheels;
		}
	}
	
	static void constructCar(Car car) {
		Utils.pause(1000);
		car.engine = "M-300";
		Utils.pause(1000);
		car.hull = "H-Truck";
		Utils.pause(1000);
		car.wheels = "Pirelli";
	}
	
	
	public static void main(String[] args) {
		final List<Car> cars = new LinkedList<>();
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					Car car = new Car();
					cars.add(car);
					constructCar(car);
					System.out.println("Ready cars: " + cars.size());
				}
			}			
		});
		
		thread.start();
		
		Utils.pause(10000);
		
		thread.stop();
		
		for (Car car : cars) {
			System.out.println(car);			
		}
	}
	
}
