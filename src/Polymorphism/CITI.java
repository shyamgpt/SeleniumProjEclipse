package Polymorphism;

public class CITI extends RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CITI obj = new CITI();
		obj.getHomeLoanROI();
		System.out.println(obj.getHomeLoanROI());

	}
	
	public double getHomeLoanROI() {
		
		return 10.5;
	}
	
	public Integer show() {
		return 10;
	}

}
