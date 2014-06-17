package lesson140306.inheritance;

public class Cat extends Pet {

	@Override
	public void makeSound() {
		System.out.println("murrrr");
	}

	@Override
	public void feed(String food) {
		makeSound();
	}

}
