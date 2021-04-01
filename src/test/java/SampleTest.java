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
	
	@Test
	   public void testDivIntPass() {
		Assert.assertEquals("error in divInt()", 3, Calculator.divInt(9, 3));
	      Assert.assertEquals("error in divInt()", 0, Calculator.divInt(1, 9));
	   }
	 
	   @Test
	   public void testDivIntFail() {
		   Assert.assertEquals("error in divInt()", 1, Calculator.divInt(9, 3));
	   }
	
	

}
