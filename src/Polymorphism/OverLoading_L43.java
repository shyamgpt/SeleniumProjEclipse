package Polymorphism;

public class OverLoading_L43 {
	/*
	 * Ques --> Can we achieve overloading by keeping methods signnature same and
	 * changing the return type? Ans is: NO. 
	 * Ques : Can we overlaod the main method
	 * in java? Ans : Yes 
	 * Polymorphism - Sama name + multiple form
	 * (Action/Behaviour) Types of polymorphism 1. Compile time /Early binding /
	 * static binding/ Overloading 2. Run time/ late Binding / Dynamic binding /
	 * Overriding Duplicacy and ambiguity
	 * 
	 * Overlaodind --> Same method name and different signature
	 * In same class we have multiple methods with same name but differnt methods signature
	 * This compile time polymorphism
	 */
	//varargs

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading_L43 obj = new OverLoading_L43();
//		obj.multiply(2, 3);
//		obj.doFacebookLogin(736872, "bnjsbf"); 
//		obj.add2(4,8);

	}

	public void add(int a, int b) {

	}

	public void add(int a, int b, int c) {
//		System.out.println

	}

	public void add(int a) {

	}

	// Eg for selenium interview --> apply same login on darden login

	public void doFacebookLogin(int mobile, String password) {
		//What is method signature -->doFacebookLogin(int mobile, String password)

	}

	public void doFacebookLogin(String userName, String password) {

	}
	
	// Println method is overload in java
	// Eg of runtime polymorhism -->
	// obj.multiply(2, 3); --> this will give run time error as complier is ambigious/ conufused
	// which one argument is int and which one is double
	
	public void multiply(int a, double b) {

	}
	
	public void multiply(double a, int b) {

	}
	
	/*
	
	public void add2(int a, double b) {
		
	}
	
    public void add2(double a, int b) {
		
	}
	
	This will give compile time error.
	obj.add2(4,8);
	
	As is both the function we have int parameter, so compiler will get confuse where to
	pass the int value and this also known as ambiguity.
	*/
	

}
