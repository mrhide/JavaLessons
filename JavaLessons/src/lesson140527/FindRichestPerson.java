package lesson140527;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class FindRichestPerson {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		useList();
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);
		System.out.println("----");
		start = System.currentTimeMillis();
		usePQ();
		stop = System.currentTimeMillis();
		System.out.println(stop - start);
	}

	private static void usePQ() {
		PriorityQueue<Person> pq = new PriorityQueue<>(11, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.money - arg1.money;
			}
		});
		for (int i = 0; i < 1500000; i++) {
			pq.add(generatePerson());
			if(pq.size() > 10) {
				pq.poll();
			}
		}
		
		for (Person person : pq) {
			System.out.println(person);
		}
		
		System.out.println("--------");
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
	
	private static void useList() {
		List<Person> list = new LinkedList<>();
		for (int i = 0; i < 1500000; i++) {
			list.add(generatePerson());
		}
		
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg1.money - arg0.money;
			}			
		});
		
		for (int i = 0; i < 10; i++) {
			System.out.println(list.get(i));
		}
	}
	
	static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	static char[] consonants = {'b', 'c', 'd', 'f', 'g', 'k', 'm', 'n', 'p'};
	static Random random = new Random();
	
	static Person generatePerson() {
		char[] ns = new char[4];
		ns[0] = consonants[random.nextInt(consonants.length)];
		ns[2] = consonants[random.nextInt(consonants.length)];
		ns[1] = vowels[random.nextInt(vowels.length)];
		ns[3] = vowels[random.nextInt(vowels.length)];
		
		String name = new String(ns);
		int age = random.nextInt(100);
		int money = random.nextInt(Integer.MAX_VALUE-1);
		
		
		
		return new Person(name, age, money);
	}
	
	
}
