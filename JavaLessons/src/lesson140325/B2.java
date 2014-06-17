package lesson140325;

public class B2 extends A {
		
	{
		state = 20;
	}
	
	@Override
	public void changeState() {
		state /= 2;
		myChangeState(100);
		state *= 3;
	}
	
	@Override
	public void changeState(int amount) {
		myChangeState(amount);
	}

	private void myChangeState(int amount) {
		System.out.println("B2");
		state -= amount;
	}
}
