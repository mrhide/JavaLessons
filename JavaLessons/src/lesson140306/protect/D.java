package lesson140306.protect;

public class D extends C {
	
	public void printState() {
		System.out.println(_state);
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.printState();
		d.changeState();
	}
	
	protected void changeState() {
		
	}
	
}
