package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTest {

	@Test
	public void test01() { //valid input 
		JUnitTesting test = new JUnitTesting(); 
		int output = test.multiply(6,-5);
		assertEquals(-30, output);
	}
	@Test
	public void test02() { //valid input with negative
		JUnitTesting test = new JUnitTesting(); 
		int output = test.multiply(304,-739);
		assertEquals(-224656, output);
	}
	@Test
	public void test03() { //invalid input with decimal
		JUnitTesting test = new JUnitTesting(); 
		int output = test.multiply(22,-5);
		assertEquals(-110, output);
	}

}
