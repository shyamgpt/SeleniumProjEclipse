package JavaStreamsSelenium;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStreamMap_L115 {
	
	

	@Test
	public void StreamMap() {
//how to convet array into Array.list
		// print the names which have letter as 'a' and convert to UpperCase
//		Stream.of("Abhijit", "Don", "Aleekya", "Adam", "rama").filter(s -> s.endsWith("a"))
//            .map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
				

		List<String> names = Arrays.asList("Abhijit", "Don", "Aleekya", "Adam", "rama", "Ahyam");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

	}
	
	/*
	 * public static void main (String[] args)
    {
 // Converting Array to ArrayList-->
        String[] geeks = {"Rahul", "Utkarsh",
                          "Shubham", "Neelam"};
 
        // Conversion of array to ArrayList
        // using Arrays.asList
        List al = Arrays.asList(geeks);
        System.out.println(al);
 
        // Adding some more values to the List.
        al.add("Shashank");
        al.add("Nishant");
 
        System.out.println(al);
    }
	 * */

}
