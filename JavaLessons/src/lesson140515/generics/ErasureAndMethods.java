package lesson140515.generics;

import java.util.ArrayList;
import java.util.List;

public class ErasureAndMethods {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		List<Float> lf = new ArrayList<>();
	
//		sum(li);
		sum(lf);
	
	}

	private static void sum(List<Float> lf) {
		// TODO Auto-generated method stub
		
	}

//	private static void sum(List<Integer> li) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
