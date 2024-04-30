package JavaStreamsSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamCollectConcepts {

	@Test
	public void streamCollect() {

		List<String> ls = Stream.of("Abi", "Don", "Ale", "Adam", "Ram").filter(s -> s.endsWith("m"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));

		//Print the unique number from the given array
		
		List<Integer>values = Arrays.asList(3,2,3,3,1,9,7);
		
		values.stream().distinct().forEach(s->System.out.println(s));

		//Sort the array and give the third index element-->
		
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Output is -->"+li.get(2));

	}

}
