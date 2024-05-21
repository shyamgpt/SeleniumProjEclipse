package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_RahulArora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("firstName", "Shyam");
		map.put("lastName", "Gupta");
		map.put("sub", "Selenium");
		map.put("location", "India");

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("firstName"));

		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("Key --> "+key+ ", Value is --> "+map.get(key));
		}
		
		

	}

}
