package lesson140325;

public class UseAB {
	
	public static void main(String[] args) {
		A a = new A();
		a.changeState();
		System.out.println(a.getState());
		a = new B();
		a.changeState();
		System.out.println(a.getState());
		a = new B2();
		a.changeState();
		System.out.println(a.getState());
		a = new C2();
		a.changeState();
		System.out.println(a.getState());
		changeYourSelf(null);
	}
	
	
	public static void changeYourSelf(A a) {
		if(a == null) {
			System.err.println("A is null");
			return;
		}
		a.changeState();
	}
	
}
