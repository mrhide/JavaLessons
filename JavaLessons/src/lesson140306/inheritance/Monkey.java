package lesson140306.inheritance;

public class Monkey extends Animal {

	@Override
	public void makeSound() {
		System.out.println("whooop-whooop");
	}
	
	@Override
	public void feed(String food) {
		if(food.equals("banana")) {
			System.out.println("aa-aaaa!");
		}
	}
	
}
