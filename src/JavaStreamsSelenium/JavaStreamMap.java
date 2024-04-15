package JavaStreamsSelenium;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStreamMap {

	@Test
	public void StreamMap() {
//how to convet array into Array.list
		// print the names which have letter as 'a' and convert to UpperCase
//		Stream.of("Abhijit", "Don", "Aleekya", "Adam", "rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
//				.forEach(s -> System.out.println(s));

		List<String> names = Arrays.asList("Abhijit", "Don", "Aleekya", "Adam", "rama", "Ahyam");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

	}

}
