package lesson140306_;

import lesson140306.vehicle.Car;
import lesson140306.vehicle.Engine;
import lesson140306.vehicle.LadaKalina;
import lesson140306.vehicle.MercedesS300;
import lesson140306.vehicle.Wheel;

public class TestDrive {
	public static void main(String[] args) {
		LadaKalina lada = new LadaKalina();
		lada.moveTo(10, 20);
		
//		lada.createWheel();
		
		MercedesS300 mers = new MercedesS300();
		mers.moveTo(10,  20);
		
		//Car car = new Car(new Engine(), new Wheel[0]);
		//car.moveTo(30, 40);
	}
}
