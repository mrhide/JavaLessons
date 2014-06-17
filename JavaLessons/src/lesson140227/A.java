package lesson140227;

public class A {

	// members
	
	int state; // field
	
	public A() {  // constructor
		System.out.println("created " + this);
	}
	
	A(int initialState) {
		this();
		state = initialState;
	}
	
	void changeState() {  // method		
		state++;		
	}
	
}
