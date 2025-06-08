package ExceptionHandling;

public class ExprtionHanldingTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * An Exception is an unwanted or unexpected event that occurs during the execution of a program 
		 * (i.e., at runtime) and disrupts the normal flow of the program's instructions.
		 * https://www.geeksforgeeks.org/exceptions-in-java/
		 * 
		 * */

		/*
		 * Halting of program adruptly is called an exception. 
		 * - In java to handle the exception we use try & Catch block 
		 * - Whenever an exception happen inside try -catch block. try will create a exception object and reference of that objcet
		 * will give to catch block 
		 * - Catch will now handle the exception and hence
		 * program will not halt adruptly.
		 * 
		 * 
		 * try { 
		 *      // code 
		 *     } catch(Exception e) {
		 *     
		 *      // code }
		 * 
		 */

		/*
		 * In a program, if there is a chance of raising an exception then the compiler
		 * always warns us about it and compulsorily we should handle that checked
		 * exception, Otherwise, we will get compile time error saying unreported
		 * exception XXX must be caught or declared to be thrown. To prevent this
		 * compile time error 
		 * 
		 * -we can handle the exception in two ways:
		 * 
		 * By using try catch By using the throws keyword
		 * 
		 * 
		 * 
		 * There are several ways to handle exceptions, including: Try and catch blocks
		 * -> Wrap the code you want to run in a try block, then follow it with a catch
		 * block to catch any exceptions.
		 * 
		 * 
		 * Throws clause --> List the exceptions you want to handle in the throws clause
		 * of the method, and let the method's caller handle them.
		 * 
		 * 
		 * Finally block --> Use the finally block along with the try and catch blocks.
		 * This block will always run, regardless of whether an exception occurs or if
		 * it's handled
		 * 
		 * 
		 * Throws and Throw Differences -->
		 * https://www.javatpoint.com/difference-between-throw-and-throws-in-java
		 */
	}

}
