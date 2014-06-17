package lesson140306.inheritance;

public abstract class Animal {
	
	public abstract void makeSound();
	public abstract void feed(String food);
	
	public void takeCare() {
		makeSound();
		feed("banana");
		feed("meat");
	}
	
}
