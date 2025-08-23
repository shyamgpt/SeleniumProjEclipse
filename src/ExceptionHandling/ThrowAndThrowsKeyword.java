package ExceptionHandling;

public class ThrowAndThrowsKeyword {

	public static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Acces Denied -You must be 18");
		} else {
			System.out.println("System granted");
		}
	}

	
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (IllegalArgumentException e) {

			System.out.println("Error: " + e.getMessage());
		}

	}
	
	/* Example of try-catch-->
	 * 
	 * 
	 * try { 
	 * int result = 10 / 0; // ArithmeticException 
	 * } catch(ArithmeticException e) {
	 *  
	 *  System.out.println("Cannot divide by zero!"); 
	 *  e.printStackTrace();
	 *  }
	 * 
	 * 
	 * */
}
