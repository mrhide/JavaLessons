package lesson140527;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsExamples {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);

		Collections.addAll(list, 40, 50, 60 , 70);
		
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		Collections.addAll(set, 100, 200, 300);
		System.out.println(Collections.disjoint(list, set));
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.rotate(list, 1);
		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
	}
	
}
