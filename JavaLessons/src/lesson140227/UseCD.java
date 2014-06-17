package lesson140227;

public class UseCD {

	public static void main(String[] args) {
		C c = new C();
		
		c.doIt();
		
		D d = new D("outer d");
		
		C c2 = new C(d);
		c2.doIt();
		
		C c3 = new C(d);
		c3.doIt();
		
		D d2 = new D("season worker");
		c.doIt(d2);
		c2.doIt(d2);
		c3.doIt(d2);
		
		c.doIt2();
	}	
	
}
