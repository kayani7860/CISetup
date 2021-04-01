import  org.junit.Assert;

import org.junit.*;


public class SampleTest {
	Calculator calculator = new Calculator();
	@Test
	public void testSum() {
		
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}
	@Test
	 public void testMultiplyWithZero() {
	       
	        Assert.assertEquals(0, calculator.multiply(0,5));
	        Assert.assertEquals(0, calculator.multiply(5,0));
	      
	    }
	
	

}
