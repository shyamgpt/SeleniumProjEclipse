package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	//HashSet, TreeSet, LinkedList HashSet implemnts Set interface
	//Does not accept duplicate values
	//element may store in random order also

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("India");
		hs.add("he");
		hs.add("she");
		hs.add("UK");
		hs.add("INDIA");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		//Iterator -->
		System.out.println("-------------");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		

	}

}
