package lesson140320;

public class Hydroplan implements SeaAirTransport {
	Boat boat = new Boat();
	AirTransport airplane = new Airplane();
	
	
	@Override
	public void fly() {
		airplane.fly();
	}
	
	@Override
	public void sail() {
		boat.sail();
	}
	
}
