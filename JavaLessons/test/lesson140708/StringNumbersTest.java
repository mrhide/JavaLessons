package lesson140708;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringNumbersTest {

	private int _number;
	private String _expected;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{10, "������"},
				{1, "����"},
				{21, "�������� ����"},
				{2, "���"},
				{3, "���"},				
		});
	}	
	
	public StringNumbersTest(int number, String expected) {
		_number = number;
		_expected = expected;
	}
	
	@Test
	public void test() {
//		assertEquals("������", StringNumbers.convert(10));
//		assertEquals("����", StringNumbers.convert(1));
//		assertEquals("�������� ����", StringNumbers.convert(21));
	
	assertEquals(_expected, StringNumbers.convert(_number));
	}

}
