package lesson140403.exceptions;

public class NullExample {

	public static void main(String[] args) {
		Object a = null;
		
		try {
			System.out.println(a.getClass().getSimpleName());
		} catch(NullPointerException npe) {
			System.out.println(npe.getMessage());
		}
		System.out.println("program continued....");
	}
	
}
