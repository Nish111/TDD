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
	@Test
	public void testNewLine() {
		assertEquals(6, main.add("1\n2,3"));
	}
	@Test
	public void testMoreNumbers() {
		assertEquals(15, main.add("1,2,3,4,5"));
	}
	@Test
	public void testNegativeNumbers() {
		try {
			main.add("-1, 2");
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}
		try {
			main.add("-1, 2, -3, -4");
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Negatives not allowed: -1, -4");
		}
	}
	
	
}
