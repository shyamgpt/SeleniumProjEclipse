package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0,  "hello");
//		hm.put(1, "Gudbuy");
		hm.put(42, "Gudbuy");
		hm.put(2, "morning");
		hm.put(3,"Evening");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		
		Set sn = hm.entrySet();
		
		Iterator itr = sn.iterator();
		
		while(itr.hasNext()) {
			Map.Entry mp = (Map.Entry)itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		

	}

}
