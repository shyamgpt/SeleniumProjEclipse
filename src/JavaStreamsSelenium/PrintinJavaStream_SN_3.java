package JavaStreamsSelenium;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class PrintinJavaStream_SN_3 {

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("AbhiJit");
		names.add("Don");
		names.add("Alok");
		names.add("Adam");
		names.add("Romiya");

//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));

	}

}
