package lesson140227;

public class F {

	E e;
	String _name;
	
	F(String name) {
		_name = name;
	}
	
	public void doIt() {
		System.out.println("Do it, " + e._name);
		e.doIt();
	}
	
}
