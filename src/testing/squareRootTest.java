package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareRootTest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		double answer = test.squareRoot(64);
		assertEquals(8, answer, 0.001);
	}

}
