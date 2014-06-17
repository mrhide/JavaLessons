package lesson140520.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();

		fillSet(hashSet);
		fillSet(treeSet);
		fillSet(linkedHashSet);

		System.out.println(hashSet);
		System.out.println(treeSet);
		System.out.println(linkedHashSet);
		
	}

	private static void fillSet(Set<Integer> hashSet) {
		hashSet.add(2000);
		hashSet.add(2000);
		hashSet.add(2001);
		hashSet.add(1990);
		hashSet.add(1996);
		hashSet.add(1918);
		hashSet.add(1867);
		hashSet.add(2050);
	}

}
