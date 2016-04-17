
public class MathMain {
	
	public int add(int a, int b) {
		if ((a < 0) || (b < 0)) {
			throw new IllegalArgumentException("Numbers cannot be negative");
			
		}
		return a + b;
	}
	// TODO subtract
	
	public int multiply(int a, int b) {
		if ((a < 0) || (b < 0)) {
			throw new IllegalArgumentException("Numbers cannot be negative");
			
		}
		return a * b;
	}
	// TODO divide

}
