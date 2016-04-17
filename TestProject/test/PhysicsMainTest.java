import static org.junit.Assert.*;

import org.junit.Test;

public class PhysicsMainTest {

	@Test
	public void testCalculateVelocity() {
		PhysicsMain tester = new PhysicsMain();
		assertEquals("The final velocity is ", 10, tester.calculateVelocity(5, 5, 1));
		
	}

}
