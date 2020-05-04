package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countingD {

	@Test //valid input with the letter D
	public void test01() {
		JUnitTesting test = new JUnitTesting(); 
		int numberOfD = test.countD("Dandelion"); 
		assertEquals(2, numberOfD);
	}
	@Test //valid input with no letter D
	public void test02() {
		JUnitTesting test = new JUnitTesting(); 
		int numberOfD = test.countD("useless"); 
		assertEquals(0, numberOfD);
	}
	@Test //valid input
	public void test03() {
		JUnitTesting test = new JUnitTesting(); 
		int numberOfD = test.countD("Dead day today"); 
		assertEquals(4, numberOfD);
	}
}
