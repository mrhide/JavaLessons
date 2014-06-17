package lesson140227;

public class E {

	F f;
	String _name;
	
	E(String name) {
		_name = name;		
	}

	public void doIt() {
		System.out.println("Do it, " + f._name);
		f.doIt();
	}
	
}
