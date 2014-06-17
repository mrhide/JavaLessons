package lesson140306.inheritance;

public class Dog extends Pet {

	@Override
	public void makeSound() {
		System.out.println("whoof-whoof");
	}

	@Override
	public void feed(String food) {
		makeSound();
		wag();
	}

	private void wag() {
		System.out.println("tail wags");
	}

}
