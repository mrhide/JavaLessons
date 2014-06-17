package lesson140306.inheritance;

public class Lion extends Animal {

	@Override
	public void makeSound() {
		System.out.println("RRRRRooooooooar!!!!");
	}
	
	@Override
	public void feed(String food) {
		if(food.equals("meat")) {
			System.out.println("murrrrrr");
		} else {
			System.out.println("RRROOOOAAAR!");
		}
	}
	
}
