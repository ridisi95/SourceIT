package HW12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class TestSimpleStringCalculator{
	
	@Test
	public void testAdd() throws Exception {
	assertEquals(new SimpleStringCalculator().add("כמצעמכצף1המהשעü2üהמüהü3"),6);
	}
	
	@Test(expected = Exception.class)
	  public void testExpectedException() throws Exception{
		new SimpleStringCalculator().add("12-12-34");
	}
	
	@Test
	public void testAddMoree1000() throws Exception {
	assertEquals(new SimpleStringCalculator().add("1001 1"),1);
	}
}