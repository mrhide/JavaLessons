package lesson140708;

import java.util.HashMap;
import java.util.Map;

public class StringNumbers {
	
	static final Map<Integer, String> words = new HashMap<>();

	static {
		words.put(1, "один");
		words.put(2, "два");
		words.put(3, "три");
		words.put(4, "четыре");
		words.put(5, "пять");
		words.put(6, "шесть");
		words.put(7, "семь");
		words.put(8, "восемь");
		words.put(9, "девять");
		words.put(10, "десять");
	}
	
	public static String convert(int number) {
		return words.get(number);
		// закончить с использованием unit-тестов
	}



}
