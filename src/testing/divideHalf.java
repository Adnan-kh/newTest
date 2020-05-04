package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideHalf {

	@Test
	public void test01() { //valid input 
		JUnitTesting test = new JUnitTesting(); 
		double answer2 = test.divideHalf(100);
		assertEquals(50, answer2,0.001);
	}
	@Test
	public void test02() { //valid input with negative and decimal 
		JUnitTesting test = new JUnitTesting(); 
		double answer2 = test.divideHalf(-5);
		assertEquals(-2.5, answer2,0.001);
	}
	@Test
	public void test03() {  
		JUnitTesting test = new JUnitTesting(); 
		double answer2 = test.divideHalf(13);
		assertEquals(6.5, answer2,0.001);
	}

}
