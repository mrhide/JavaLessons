package lesson140225;

public class BreakExample {
	public static void main(String[] args) {
		
		
		int a[] = {10, 20, 30, 20, -40, 12};
		
		int x = 20;
		
		int index = find(a, x);
		
		if(index == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Index of " + x + " is " + index);
		}
	}

	private static int find(int[] a, int item) {
		
		int found = -1;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == item) {
				found = j;
				break;
			}
		}
		
		System.out.println("Found at " + found);
		
		return 0;
	}
}
