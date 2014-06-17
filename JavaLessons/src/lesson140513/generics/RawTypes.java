package lesson140513.generics;

import java.util.ArrayList;
import java.util.List;

public class RawTypes {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(10);
		
		List<String> l2;
		
		l2 = list;
		
		String s = l2.get(0);
		
	}
	
	
}
