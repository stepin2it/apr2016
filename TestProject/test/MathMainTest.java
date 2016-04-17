import static org.junit.Assert.*;

import org.junit.Test;

public class MathMainTest {

	@Test
	public void test() {
		MathMain tester = new MathMain();
		assertEquals("The sum of 10 and 15 is ", 25, tester.add(10, 15));
	}
	
	/* 
	@Test
	public void testNegativeCase() {
		MathMain tester = new MathMain();
		tester.add(-10, -15);
	}
	*/
	@Test
	public void testMultiply() {
		MathMain tester = new MathMain();
		assertEquals("The product of 0 and 10 is ", 0, tester.multiply(0, 15));		
	}
	


}
