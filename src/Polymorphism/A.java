package Polymorphism;

public  abstract class A {
	
	public abstract void  Test();

	
	/* Polymorphism - Same name + Multiple form
	 * (action/behaviour)
	 * 
	 * Types of polymorphism -->
	 * 
	 * 1. Compile time polymorphism/ early binding / static binding / overloadig
	 * 
	 * -Same method name and different signature
	 * -In same name we have multiple methods with same name but different method signature
	 * -Method signature --> getHomeLoanROI(String BankName)
	 * 
	 * 2. Run time polymorphism / late binding / Dynamic binding /overriding 
	 * 
	 * Over loadind Examples with different method signature-->
	 * 
	 *  public void getHomeLoanROI() {
	 *	return 8.5;
	 * }
	 * 
	 * public void getHomeLoanROI(String BankName) {
	 *	return 8.5;
	 * }
	 * 
	 *  public void getHomeLoanROI(String bankName, int Amount) {
	 *	return 8.5;
	 *  }
	 *  
	 *  public void getHomeLoanROI(int Amount, String bankName) {
	 *	return 8.5;
	 *  }
	 * 
	 * 
	 * 
	 * Wrapper classes-->
	 * 
	 * primitive data type and their classes-->
	 * 
	 * int  - Integer
	 * double - Double
	 * char - Character
	 * 
	 * Eg-- we are wrapping int data type into Integer data type-->
	 * a)-->
	 * public int show(){
	 *  return 10;
	 * }
	 * 
	 * b)-->
	 * public Integer show(){
	 *  return 10;
	 * }
	 * --> Here we are wrapping int data type to Intger data type as Integer is the 
	 * parent class of int data type
	 * 
	 * // Here parent class of int is Intger
		// So here 10 is not int , now it is object of Ingeter class
		// Number is the super most class of all the number
	 * 
	 * Search for --Number class java docs
	 * https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html
	 * 
	 * 
	 * 
	 * */
	
	
}
