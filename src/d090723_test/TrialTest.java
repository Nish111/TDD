package d090723_test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import d090723.Main;

public class TrialTest {
	Main main;
	
	@Before
	public void init() {
		main = new Main();
	}
	
	@After
	public void destroy() {
		main = null;
	}
	@Test
	public void testEmptyString() {
		assertEquals(0, main.add(""));
	}
	@Test
	public void testOnlyOneNumber() {
		assertEquals(1, main.add("1"));
	}
	@Test
	public void testManyNumbers() {
		assertEquals(3, main.add("1,2"));
	}
	@Test
	public void testDelimiter() {
		assertEquals(3, main.add("//.;\n1;2"));
	}
}
