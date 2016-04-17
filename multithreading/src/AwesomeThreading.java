
public class AwesomeThreading {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			@Override 
			public void run() {
				for (int j = 1; j < 1000; j++) {
					if (isPrime(j)) {
						System.out.println("Is a prime number : " + j);
					}
				}
				
			}
		};

		Thread t2 = new Thread(){
			@Override 
			public void run() {
				for (int j = 1; j < 1000; j++) {
					
						System.out.println("Is just a number : " + j);
			
				}
				
			}
		};
		t1.start();
		t2.start();
	}
	
	public static boolean isPrime(int n) {
		for (int count = 0; count < n/2; count++) {
			try {
				if (n % count == 0) {
					return false;
				}	
			} catch (Exception ex) {
				System.out.println("ex : " + ex.toString());
			} finally {
				System.out.println("Cleanup");
			}
			
		}
		return true;
	}
}
