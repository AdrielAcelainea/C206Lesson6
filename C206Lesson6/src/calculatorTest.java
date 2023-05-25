import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		calculator cal = new calculator();
		int actual = cal.add(a, b);
		int expected = 9999;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		calculator cal = new calculator();
		int actual = cal.subtract(a, b);
		int expected = 5555;
		assertEquals(actual,expected);
	}
	@Test
	public void testMultiple() {
		int a = 2000;
		int b = 4000;
		calculator cal = new calculator();
		int actual = cal.multiple(a, b);
		int expected = 8000000;
		assertEquals(expected,actual);
	}
	@Test
	public void testDivide() {
		int a = 6900;
		int b = 30;
		calculator cal = new calculator();
		int actual = cal.divide(a, b);
		int expected = 230;
		assertEquals(actual,expected);
	}
	@Test
	public final void testExp() {
		int a = 3;
		int b = 2;
		calculator cal = new calculator();
		int actual = cal.exp(a, b);
		int expected = 1;
		assertEquals(expected,actual);
	}

}
