package lesson140515.generics.restrictions;

import java.util.List;

public class Arrays<T> {

	public static void main(String[] args) {
//		List<Integer>[] arrayOfLists = new List<Integer>[10]; ERROR
		List<?>[] arrayOfLists = new List<?>[10];
		List<?>[] arrayOfLists2 = new List[10];
		
		List<String>[] aos = (List<String>[]) new List[10];
	}
	
}
