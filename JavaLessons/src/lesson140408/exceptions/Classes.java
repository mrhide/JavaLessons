package lesson140408.exceptions;

public class Classes {

	interface Vehicle {
		void mode();
	}
	
	static class Car implements Vehicle {

		@Override
		public void mode() {
			
		}
		
	}
	
	public static void main(String[] args) {
		
//		inspect("hello");
		inspect(new Car());
	}

	private static void inspect(Object object) {
		System.out.println(object.getClass().getSimpleName());
		
		if(object instanceof String) {
			System.out.println("string");
		}
		if(object instanceof Car) {
			System.out.println("Car");
		}
		if(object instanceof Vehicle) {
			System.out.println("Vehicle");
		}
		if(object.getClass() == Car.class) {
			System.out.println("Car class");
		}
		if(object.getClass() == Vehicle.class) {
			System.out.println("Vehicle class");
		}
	}
	
}
