package lesson140325;

public class A implements Changeable {

	int state;
	
	public int getState() {
		return state;
	}
	
	public void changeState() {
		state += 10;
	}
	
	public void changeState(int amount) {
		state += amount;
	}
}
