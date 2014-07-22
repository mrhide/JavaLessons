package tetris;

import static org.junit.Assert.*;

import org.junit.Test;

public class FieldTest {

	@Test
	public void testWidthHeight() {
		assertEquals(20, Field.HEIGHT);
		assertEquals(9, Field.WIDTH);
	}
	
	@Test
	public void testBox() throws Exception {
		Field field = new Field();
		assertNotNull(field.box);
		assertEquals(20, field.box.length);
		assertEquals(9, field.box[0].length);
	}

}
