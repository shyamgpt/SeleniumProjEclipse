package Polymorphism;

public class HSBC extends RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBC obj = new HSBC();
		obj.getHomeLoanROI();

	}

	public double getHomeLoanROI() {

		return 11.25;
	}
	
	
	public HSBC getObject() {
		HSBC obj = new HSBC();
		return obj;
	}
	
	//change of return type is no here
	
//	public int getHomeLoanROI() {
//
//		return 11.25;
//	}

}
