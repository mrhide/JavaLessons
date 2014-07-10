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
				{10, "десять"},
				{1, "один"},
				{21, "двадцать один"},
				{2, "два"},
				{3, "три"},				
		});
	}	
	
	public StringNumbersTest(int number, String expected) {
		_number = number;
		_expected = expected;
	}
	
	@Test
	public void test() {
//		assertEquals("десять", StringNumbers.convert(10));
//		assertEquals("один", StringNumbers.convert(1));
//		assertEquals("двадцать один", StringNumbers.convert(21));
	
	assertEquals(_expected, StringNumbers.convert(_number));
	}

}
