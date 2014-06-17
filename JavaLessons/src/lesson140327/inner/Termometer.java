package lesson140327.inner;


public class Termometer {

	private int temp = 23;
	
	private TemperatureObserver c;
	
	public void setObserver(TemperatureObserver c) {
		this.c = c;
	}
	
	public void inc() {
		temp++;
		c.currentTemp(temp);
		System.out.println("== " + temp);
		
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	public void dec() {
		temp--;
		c.currentTemp(temp);
		System.out.println("== " + temp);
		
	}
	
}
