package lesson140227;

public class UseEF {

	public static void main(String[] args) {
	
		E e = new E("Pete");
		F f = new F("Nick");
		
		e.f = f;
		f.e = e;
		
	}
	
}
