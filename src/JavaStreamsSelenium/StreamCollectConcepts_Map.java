package JavaStreamsSelenium;

/*Termination operation -->
 * 1. Count();
 * 2.Limit();
 * 
 * */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamCollectConcepts_Map {

	@Test
	public void streamCollect() {

		
		// How to print the stream --> 
	/*	Stream.of("Abi", "Don", "Ale", "Adam", "Ram").filter(s -> s.endsWith("m"))
		.map(s -> s.toUpperCase()).forEach(s->System.out.println(s)); */
		
		
	//print names which have last letter as "a" with Uppercase
		List<String> ls = Stream.of("Abi", "Don", "Ale", "Adam", "Ram").filter(s -> s.endsWith("m"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		

		//Print the unique number from the given array and Converting array to ArrayList-->
		List<Integer>values = Arrays.asList(3,2,3,3,1,9,7);
		values.stream().distinct().forEach(s->System.out.println(s));

		//Sort the array and give the third index element-->
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Output is -->"+li.get(2));
		
		//print names which have first letter as a with uppercase and sorted 
		List<String>names = Arrays.asList("Abi", "Don", "Ale", "Adam", "Aram");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s-> s.toUpperCase()).forEach(s->System.out.println(s));

	}

}
