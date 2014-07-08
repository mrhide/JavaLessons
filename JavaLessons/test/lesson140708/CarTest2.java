package lesson140708;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest2 {
	
	private Car car;

	@Before
	public void setup() {
		car = new Car(4);
		// some other setup code
	}

	@Test
	public void testEngine() throws Exception {
		assertTrue(car.hasEngine());
	}
	
	@Test
	public void testPower() throws Exception {
		
	}
}
