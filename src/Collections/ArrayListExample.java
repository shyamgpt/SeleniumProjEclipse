package Collections;

import java.util.ArrayList;

public class ArrayListExample {
	// can accept duplicate values
	// ArrayList, LinkedList, Vector - Implementing the List Interface
	// array is fixed while arrayList can dynamically grow
	//You can access and insert any value in java
	//It guarantee the order while set is not.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
//		a.remove(1);
//		a.remove("java");
//		System.out.println(a);
		
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("java"));
		
	   System.out.println(a.indexOf("rahul"));
	   System.out.println(a.isEmpty());
	   System.out.println(a.size());

	}

}
