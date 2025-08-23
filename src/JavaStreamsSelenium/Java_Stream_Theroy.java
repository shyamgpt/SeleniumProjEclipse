package JavaStreamsSelenium;

import java.util.ArrayList;

public class Java_Stream_Theroy {
	/*
	 * 1.What are Streams?
	 * 
	 * Steams API is new features availble from JAVA 8
	 * -By using streams, we can perform various aggregate operation on the data returned
	 * from collections classes by drastically reduce the complexity of code.
	 * 
	 * 
	 *2.What is Lambda Expression?
	 * 
	 * Lambda expression introduce the new arrow operator -> into java. It divides the
	 * lambda expression in two part:
	 * 
	 * a. The left side specifies the parameter requires by the expression, which could
	 * also be empty if no parameter is required.
	 * 
	 * b. The right side is the lambda body which specifies the actions of the lambda
	 * expression.
	 * 
	 * 3. The working of stream can be explained in three stages-->
	 * 
	 * a. Create a stream
	 * 
	 * b. Perform intermeadiate operation on the initial stream to transform it into
	 * another stream so on further operations
	 * 
	 * c. Perform terminal operation on the final stream to get the result.
	 * 
	 * An important characteristic of intermediate operation is laziness.
	 * When executing this code snippet. nothing is printed to the console. That is because
	 * intermediate operations will only be executed when a terminal operation is present.
	 * 
	 * 
	 * 
	 * Note-->
	 * 
	 * The Aggregate operations that we perform on the collection, array or any other 
	 * data source do not change the data of the source, they simply return a new stream.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("AbhiJit");
		names.add("Don");
		names.add("Alok");
		names.add("Adam");
		names.add("Romi");

        there is no life for intermediate operation if there is no terminal operation
 		terminal operation will execute only if inter op (filter) returns true
 		We can create Streams
		How to use filter in Stream Api

		long count = names.stream().filter(s -> s.startsWith("D")).count();

		System.out.println(count);

	}
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
	 * ().filter(s -> s.startsWith("A"))-->It is an internediate operation.
	 * 
	 * 
	 * */

}
