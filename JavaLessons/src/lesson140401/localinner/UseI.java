package lesson140401.localinner;

public class UseI {

	public static void main(String[] args) {

		A a = new A();
		C c = new C();
		
//		a.getI().doIt();
//		c.getI().doIt();
		
		X[] arrayOfX = new X[] {a, c};
		makeThemDoIt(arrayOfX);
		
	}
	
	public static void makeThemDoIt(X[] arrayOfX) {
		for (X x : arrayOfX) {
			//x.getI().doIt();
		}
	}
	
}
