package lesson140227;

public class C {
	
	D d = new D("init field");
	
	{
		d = new D("init instance");
		System.out.println("d = " + d);
	}
	
	C() {		
		d = new D("default constructor");
	}
	
	C(D d) {
		this.d = d;
	}
	
	void doIt() {
		d.doIt();
	}
	
	void doIt(D d) {
		d.doIt();
	}
	
	void doIt2() {
		new D("temporary internal worker").doIt();
	}
}
