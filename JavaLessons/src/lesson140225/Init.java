package lesson140225;

public class Init {
	public static void main(String[] args) {
		
		int x;
		x = 20;
		
		int[] a = new int[x];
		
		int[] b = {10, 20, 30};
		
		int[] c;
		
		c = new int[] {19, 30, 59, 39};
		
		for (int element : a) {
			System.out.println(element);
		}
		
		String[] StringArray = new String[5];
		
		for (String string : StringArray) {
			System.out.println(string);
		}
		
		boolean[] bool = new boolean[3];
		
		for (int i = 0; i < bool.length; i++) {
			System.out.println(bool[i]);
		}
		
	}
}
