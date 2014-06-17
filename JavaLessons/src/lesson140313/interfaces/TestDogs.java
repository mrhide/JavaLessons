package lesson140313.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestDogs {

	public static void main(String[] args) {
		List<Dog> dogs = new LinkedList<Dog>();
		
		Dog dog1 = new Dog("Шарик", 10, 4, 5);
		Dog dog2 = new Dog("Лорд", 20, 10, 40);
		Dog dog3 = new Dog("Сосиска", 6, 10, 3);
		Dog dog4 = new Dog("Милорд", 6, 10, 3);
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);

		Dog[] dogsArray = new Dog[3];
	
		for (int i = 0; i < dogsArray.length; i++) {
			dogsArray[i] = dogs.get(i);
			System.out.println(dogsArray[i].name);
		}
		
		Collections.sort(dogs);
		
		for (Dog dog : dogs) {
			System.out.println(dog.name);
		}
		
		Arrays.sort(dogsArray);
		
		for (Dog dog : dogsArray) {
			System.out.println(dog.name);
		}
		
		System.out.println(dog1.compareTo(dog2));
		System.out.println(dog2.compareTo(dog3));
		System.out.println(dog3.compareTo(dog4));
	
	}
	
}
