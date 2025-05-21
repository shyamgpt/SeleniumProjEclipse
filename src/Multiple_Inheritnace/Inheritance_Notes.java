package Multiple_Inheritnace;

public class Inheritance_Notes {

	/*
	 * Why Mutiple inheritnace is not allowed in Java?
	 * 
	 *  parent-1                              Parent-2
	 *  Show()                                Show()
	 *  
	 *  
	 *  
	 *                 Child class
	 *                 Show();
	 *                 
	 *                 
	 *                 
	 *  Here child have two parent and each parent have show() method, and child
	 *  inherited the parent class ans want to call show() method, so at this point
	 *  of time JVM will get confuse which show() method should i call i.e from parent-1
	 *  or parent-2, and this will caus ambuguity/confusion that's why multiple inheritance
	 *  is not allowed int java.               
	 *  
	 * 
	 * 
	 * */
	
}
