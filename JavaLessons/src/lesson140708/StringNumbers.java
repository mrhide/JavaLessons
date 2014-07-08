package lesson140708;

import java.util.HashMap;
import java.util.Map;

public class StringNumbers {
	
	static final Map<Integer, String> words = new HashMap<>();

	static {
		words.put(1, "����");
		words.put(2, "���");
		words.put(3, "���");
		words.put(4, "������");
		words.put(5, "����");
		words.put(6, "�����");
		words.put(7, "����");
		words.put(8, "������");
		words.put(9, "������");
		words.put(10, "������");
	}
	
	public static String convert(int number) {
		return words.get(number);
		// ��������� � �������������� unit-������
	}



}
