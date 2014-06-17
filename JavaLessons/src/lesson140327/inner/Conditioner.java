package lesson140327.inner;

public class Conditioner implements TemperatureObserver {

	public void hot() {
		/*if(temp > 25) {
			System.out.println("cond on");
		}*/
		
	}

	public void cold() {
		/*if(temp < 20) {
			System.out.println("cond off");
		}*/
	}

	public static void main(String[] args) {
		Conditioner c = new Conditioner();
		Termometer t = new Termometer();
		
		t.setObserver(c);
		
		t.inc();
		t.inc();
		t.inc();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		
	}

	@Override
	public void currentTemp(int temp) {
		
	}
	
}
