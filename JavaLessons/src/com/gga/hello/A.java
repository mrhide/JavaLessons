package com.gga.hello;

public class A {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, -40 };
		printArray(a);

		int[] b = null;
		System.out.println(b);

		b = new int[10];
		printArray(a);

		b = new int[] { 10, 2, 4, 5 };
		printArray(b);

		String[] s = new String[5];
		printArray(s);

		max(null);
		max(new int[0]);
		max(new int[] {10});
	}

	static int max(int[] a) {
		if (a == null) {
			return Integer.MIN_VALUE;
		}
		
		if (a.length <= 0) {
			return Integer.MIN_VALUE;
		}
		
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;

	}

	private static void printArray(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("Max element = " + max(a));
	}

}
