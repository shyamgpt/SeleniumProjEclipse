package JavaStreamsSelenium;

import java.util.ArrayList;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStreamMap_L115 {
	
//	public static void main (String[] args) {
//	
//	
//	ArrayList<String> names = new ArrayList<String>();
//	names.add("Abhi");
//	names.add("Don");
//	names.add("Alekya");
//	names.add("Adam");
//	names.add("Ram");
//	
//	int count = 0;
//	for(int i =0; i<names.size(); i++) {
//		String actual = names.get(i);
//		if(actual.startsWith("A")) {
//			count++;
//		}
//	}
//	System.out.println(count);
//	
//}
//

	@Test
	public void StreamMap() {
//how to convet array into Array.list
		// print the names which have letter as 'a' and convert to UpperCase
		Stream.of("Abhijit", "Don", "Aleekya", "Adam", "rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		List<String> names = Arrays.asList("Abhijit", "Don", "Aleekya", "Adam", "rama", "Ahyam");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		
		
//		List<String> countNames = Arrays.asList("Abhijit", "Don", "Aleekya", "Adam", "rama", "Ahyam");
//		names.stream().filter(s -> s.startsWith("A")).count();
//		System.out.println(countNames);

	}

	/*
	 * public static void main (String[] args) { // Converting Array to ArrayList-->
	 * String[] geeks = {"Rahul", "Utkarsh", "Shubham", "Neelam"};
	 * 
	 * // Conversion of array to ArrayList // using Arrays.asList List al =
	 * Arrays.asList(geeks); System.out.println(al);
	 * 
	 * // Adding some more values to the List. al.add("Shashank");
	 * al.add("Nishant");
	 * 
	 * System.out.println(al); }
	 */



	/**
	 * What are streams?
	 * 
	 * Stream API is new features available from Java-8
	 * By Using streams, we can perform various agrregation operations on the data returned
	 * from collections classes by drastically reduce the complexity of code.
	 * 
	 * 
	 * What is Lambda Expression?
	 * 
	 * Lambda expression introduce the new operator --> into java.
	 * It divides the lambda expression in two part:
	 * 
	 * The left side specifies the parameter required by the expression, which could also be 
	 * empty if no parameters are required.
	 * 
	 * The right side is the lamda body which epecifies the actions of the lambda expression
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
