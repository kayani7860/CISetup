

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class SampleTest {
	
	
	Calculator cal= new Calculator();
	
	@Test
	public void AddFuncTest() {
		assertEquals("",3,cal.add(2,1));
		assertEquals(10,cal.add(5,5 ));
	}
	

}
