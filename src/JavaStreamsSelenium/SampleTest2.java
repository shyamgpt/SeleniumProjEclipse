package JavaStreamsSelenium;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class SampleTest2 {
	
	
	@Test
	public static void regular() {
		
		
	
	
	Long d = Stream.of("Abi", "Don", "Ale", "Adam", "Ram").filter(s->{
		s.startsWith("R"); return true;}).count();
	System.out.println("d is -->"+d);
		
		
	}
	
	

}
