package lesson140513.generics;

import java.util.Vector;

public class ModernStyle {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("zero");
		v.add("one");
		v.add("two");
		
		String s = v.get(1);
		
//		v.add(10); compile error
		
		Vector<Integer> vi = new Vector<>(); // Diamond construction (for Java 7+)
		
		vi.add(10);
		vi.add(20);
		vi.add(30);
		
		int i = vi.get(2);
		
		
	}
	
}
