package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareRootTest {

	@Test //valid input
	public void test01() {
		JUnitTesting test = new JUnitTesting();
		double answer = test.squareRoot(64);
		assertEquals(8, answer, 0.001);
	}
	@Test //valid input 
	public void test02() {
		JUnitTesting test = new JUnitTesting();
		double answer = test.squareRoot(29241);
		assertEquals(171, answer, 0.001);
	}
	@Test //invalid input 
	public void test03() {
		JUnitTesting test = new JUnitTesting();
		double answer = test.squareRoot(4);
		assertEquals(2, answer, 0.001);
	}

}
