package lesson140320;

public class UseVehicles {

	public static void main(String[] args) {
		Car car = new Car();
		SeaTransport boat = new Boat();
		Amphibia amphibia = new Amphibia();
		AirTransport airplane = new Airplane();
		Hydroplan hydroplan = new Hydroplan();
		
		car.drive();
		boat.sail();
		amphibia.drive();
		amphibia.sail();

		travelBySea(boat);
		travelBySea(amphibia);
		travelBySea(hydroplan);
		
		travelByAir(airplane);
		travelByAir(hydroplan);
		travelByLand(car);
	}
	
	

	private static void travelByLand(LandTransport landTransport) {
		landTransport.drive();
	}



	private static void travelByAir(AirTransport airTransport) {
		airTransport.fly();
	}



	private static void travelBySea(SeaTransport seaTransport) {
		seaTransport.sail();
	}
}
