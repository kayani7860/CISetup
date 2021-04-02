

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class SampleTest {
	
	
	Calculator cal= new Calculator();
	
	@Test
	public void addFuncTestSimple() {
		
		int result=cal.add(2, 2);
		if(result!=4) {
			Assert.fail();
		}	
	}
	
	@Test
	public void AddFuncTest1() {
		assertEquals(3,cal.add(2,1));

	}
	@Test
	public void AddFuncTest2() {
		assertEquals(10,cal.add(5,5 ));
		
	}
	@Test
	public void AddFuncTest3() {
		assertEquals(13,cal.add(5,8 ));
		
	}
	
	@Test
	public void AddFuncTest4() {
		assertEquals(14,cal.add(5,9 ));
	}


	

	

}
