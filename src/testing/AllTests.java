package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ countingD.class, divideHalf.class, multiplyTest.class, squareRootTest.class })
public class AllTests {

}
