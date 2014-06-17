package com.gga.hello;

public class Hello {
	
	// Entry point
	public static void main(String[] args) {
		
		int j = 0;
		System.out.println(++j);
		j = 0;
		System.out.println(j++);
		
		System.out.println("Hello, World!");
		for(int i=0;i< args.length; i++) {
			System.out.println("Parameter "+i+" = "+args[i]);
		}
		
		int i;		
		
		i = 0;
		while(i < args.length) {
			System.out.println("Parameter "+i+" = "+args[i++]);
		}
		
		i = 0;
		do {
		System.out.println("Parameter "+i+" = "+args[i++]);
		} while (i < args.length);
		
	}
	
}
