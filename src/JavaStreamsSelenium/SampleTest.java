package JavaStreamsSelenium;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class SampleTest {
	
	
	@Test
	public static void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("AbhiJit");
		names.add("Don");
		names.add("Alok");
		names.add("Adam");
		names.add("Romi");
		
		
		int count =0;
		
		for(int i =0; i<names.size(); i++) {
			
			String actualName = names.get(i);
			
			if(actualName.startsWith("A")){
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	
	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("AbhiJit");
		names.add("Don");
		names.add("Alok");
		names.add("Adam");
		names.add("Romi");
		
		//there is no life for intermediate op if there is no terminal op
//		terminal operation will execute only if inter op (filter) returns true
//		We can create Streams
//		How to use filter in Stream Api
		
	long count = 	names.stream().filter(s->s.startsWith("D")).count();
	
	System.out.println(count);
	
	
	
		
	}
	
	

}
