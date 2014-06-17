package lesson140320;

public class JamesBondSuperCar extends Car implements SeaAirTransport {

	Airplane plane = new Airplane();
	Boat boat = new Boat();
	
	
	@Override
	public void fly() {
		plane.fly();
	}

	@Override
	public void sail() {
		boat.sail();
	}	
	
}
