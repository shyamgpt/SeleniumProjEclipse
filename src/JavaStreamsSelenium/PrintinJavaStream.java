package JavaStreamsSelenium;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class PrintinJavaStream {

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("AbhiJit");
		names.add("Don");
		names.add("Alok");
		names.add("Adam");
		names.add("Romiya");

//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	}

}
