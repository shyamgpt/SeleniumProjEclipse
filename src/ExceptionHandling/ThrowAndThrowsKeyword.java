package ExceptionHandling;

public class ThrowAndThrowsKeyword {
	
	public static void checkAge(int age) throws ArithmeticException {
		if(age < 18) {
			throw new ArithmeticException("Acces Denied -You must be 18");
		}
		else {
			System.out.println("System granted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);

	}

}
