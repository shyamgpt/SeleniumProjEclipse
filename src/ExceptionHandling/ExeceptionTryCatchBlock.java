package ExceptionHandling;

public class ExeceptionTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b =5, c = 5, result;
		
		try {
			result = a /(b-c);
			System.out.println("result" + result);
			
		}  catch(ArithmeticException e) {
			System.out.println("Exception caught: Division by zero");
			e.printStackTrace();
		}
		finally {
			System.out.println("Im i final block");
		}

	}

}
