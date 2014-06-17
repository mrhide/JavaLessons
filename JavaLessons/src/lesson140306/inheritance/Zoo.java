package lesson140306.inheritance;

public class Zoo {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Monkey monkey = new Monkey();
		
//		Animal animal = new Animal(); ERROR: abstract class
		
		lion.takeCare();
		monkey.takeCare();
		
		new Cat().takeCare();
		new Dog().takeCare();
		
	}
	
}
