package lesson140515.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardHelper {

	static void foo (List<?> list) {
//		list.set(0, list.get(0));
		helper(list);
	}

	static private <T> void helper(List<T> list) {		
		list.set(0, list.get(0));
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		foo(list);
	}
	
}
