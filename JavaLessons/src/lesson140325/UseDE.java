package lesson140325;

public class UseDE {
	
	public static void main(String[] args) {
		
		D d = new D();
		E e = new E();
		A a = new A();

		use(d);
		use(e);
		use(a);
		use(new C2());
		
	}

	private static void use(Changeable object) {
		object.changeState();
		return;
	}
	
}
