package com.gga.hello;

public class B {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: B <number>");
//			return;
			System.exit(0);
		}
		
		System.out.println("Arg: " + args[0]);			
		int age = Integer.parseInt(args[0]);
		System.out.println("Age: " + age);
		
		if (age < 11) {
			System.out.println("�������");
		} else	
		if (age < 16) {
			System.out.println("���������");
		} else		
		if (age < 25) {
			System.out.println("�����");
		} else		
		if (age < 40) {
			System.out.println("������� �������");
		} else		
		if (age >= 40) {
			System.out.println("������");
		}
		
		if(age % 2 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}
	}
}
