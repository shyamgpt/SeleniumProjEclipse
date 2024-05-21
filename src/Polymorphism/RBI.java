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
	}

}
