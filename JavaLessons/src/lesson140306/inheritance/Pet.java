package lesson140306.inheritance;

public abstract class Pet extends Animal {
	
	public void brush() {
		System.out.println("brush");
	}
	
	@Override
	public void takeCare() {
		super.takeCare();
		brush();
	}
	
}
