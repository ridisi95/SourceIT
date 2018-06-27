package HW12;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestSimpleStringCalculator{
	
	SimpleStringCalculator ssc = new SimpleStringCalculator();
	String str = "9353c9mx2k2c2";
	int x;
	
	@BeforeClass
	public static void beforeClass() {
	}
	
	@Test
	public void testAdd() {
	int x = ssc.add(str);
	
	assertEquals(x,6);
	}
}
