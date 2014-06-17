package lesson140325;

public class Overload {

	int state;
	
	public void changeState() {
		state++;
	}
	
	public void changeState(int amount) {
		state += amount;
	}
	
	public void changeState(boolean positive) {
		if(positive) {
			state++;
		} else {
			state--;
		}
	}
	
	public void changeState(boolean positive, int amount) {
		if(positive) {
			state += amount;
		} else {
			state -= amount;
		}
	}
	
	// параметрический полиморфизм (в Java присутствует в форме перегрузки overload)
	public void changeState(int amount, boolean product) {
		if(product) {
			state *= amount;
		} else {
			state /= amount;
		}
	}
	
	
	
	
	
}
