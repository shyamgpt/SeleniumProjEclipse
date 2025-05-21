package Polymorphism;

public class RBI {
	
	public double getHomeLoanROI() {
		return 8.5;
	}
	
	public double getCarLoanROI() {
		return 10.5;
	}
	
	public RBI getObject() {
		RBI obj = new RBI();
		return obj;
	}
	
	public Integer show() {
		return 10;
		// Here parent class of int is Intger
		// So here 10 is not int , now it is object of Ingeter class
		// Number is the super most class of all the number
		
		//WebDriver driver  = new FirefoxDriver();
		//here driver is the polymorphic reference
		
		/* class A {
		 * Print(A);
		 * }
		 * 
		 * Class B extend A{
		 * print(8)
		 * }
		 * 
		 * psvm(){
		 * 
		 * A a = new A();
		 * B b = new B();
		 * 
		 * A b = new B();
		 * 
		 * B b = new A(); -- Not possible
		 * 
		 * we can give the parent class refernce for child class.
		 * As the property of Parent class cann't be stored in child class. 
		 *
		 * }
		 * 
		 * 
		 * 
		 * 
		 * */
	}

}
