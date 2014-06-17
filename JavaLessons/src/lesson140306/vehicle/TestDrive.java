package lesson140306.vehicle;

public class TestDrive {
	public static void main(String[] args) {
		LadaKalina lada = new LadaKalina();
		lada.moveTo(10, 20);
		
//		lada.createWheel();
		
		MercedesS300 mers = new MercedesS300();
		mers.moveTo(10,  20);
		
		//Car car = new Car(new Engine(), new Wheel[0]);
	}
}
