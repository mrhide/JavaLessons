package lesson140403.exceptions;

import java.util.LinkedList;
import java.util.List;

public class EagerMemoryConsumer {
	
	public static void main(String[] args) {
		
		List list = new LinkedList();
		
		while (true) {
			list.add(new long[10000]);
		}
		
	}
	
}
