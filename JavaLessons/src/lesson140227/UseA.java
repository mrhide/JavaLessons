package lesson140227;

public class UseA {
	public static void main(String[] args) {
		
		A a = new A();  // instance	
		
		
		a.changeState();
		
		//System.out.println(a);
		
		A a2 = new A(10);
		
		a2.changeState();
		a2.changeState();
		
		System.out.println(a2.state);
		
		A a3 = a;
		//System.out.println(a3);
		a3.changeState();
		//System.out.println(a.state);
		
		A a4 = null;
		
		//System.out.println(a4);
		useA(a4);
		
	}

	static void useA(A a) {
		if(a == null) {
			return;
		}
	
		a.changeState();
	}
}
