package HW12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class TestSimpleStringCalculator{
	
	SimpleStringCalculator ssc = new SimpleStringCalculator();
	String str = "כמצעמכצף1המהשעü2üהמüהü3";
	int x;
	
	@Rule
	  public ExpectedException thrown = ExpectedException.none();
	
	@BeforeClass
	public static void beforeClass() {
	}
	
	
	@Test
	public void testAdd() {
	int x = ssc.add(str);
	
	assertEquals(x,6);
	
	}
	
	@Test(expected = Exception.class)
	  public void testExpectedException(){
	    ssc.add("-12-123-4") ;
//	    thrown.expect(java.lang.Exception.class);
	  }
}