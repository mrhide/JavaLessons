package lesson140708;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GraphTestPattern {

	static {
		System.out.println("static init");
	}
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("BeforeClass");
	}
	
	{
		System.out.println("instance init");
	}
	
	public GraphTestPattern() {
		System.out.println("constructor");
	}
	
	@Before
	public void setup() {
		System.out.println("Before");
	}
	
	@After
	public void teardown() {
		System.out.println("After");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@AfterClass
	public static void teardownClass() {
		System.out.println("AfterClass");
	}
}
