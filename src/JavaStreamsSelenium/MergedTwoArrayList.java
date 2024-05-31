package JavaStreamsSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergedTwoArrayList {
	
	@Test
	public static void mergeTwoList() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sonal");
		names.add("Deepu");
		names.add("Sangeeeta");
		names.add("Romi");
		
		
		List<String> names1 = Arrays.asList("Abhijit", "Don", "Aleekya", "Adam", "Rama", "Ahyam");
		
		//Merging two DifferentList
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//		newStream.sorted().forEach(s->System.out.println(s));
//		
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
	    Assert.assertTrue(flag);

	}

}
