package lesson140225;

public class Operations {
	
	public static void main(String[] args) {
		
		int x = 20;
		
		if(x % 2 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}
		
		System.out.println(!(x % 2 == 0) ? "��������" : "������");
		
		String s = null;
		
		if(s != null && s.equals("Hello")) {
			System.out.println("Hello too");
		}
		
		System.out.println(256 >> 4);
		
		x = 2334234;
		
		System.out.println(x & 0xFF);
		
	}
	
}
