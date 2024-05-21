package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapQuestion {
	  static void characterCount(String inputString)
	    {
	        // Creating a HashMap containing char
	        // as a key and occurrences as  a value
	        HashMap<Character, Integer> charCountMap
	            = new HashMap<Character, Integer>();
//	        System.out.println(charCountMap);
	 
	        // Converting given string to char array
	 
	        char[] strArray = inputString.toCharArray();
	 
	        // checking each char of strArray
	        for (char c : strArray) {
	            if(c!= ' ') {
	            	
	            	if (charCountMap.containsKey(c)) {
	            		 
		                // If char is present in charCountMap,
		                // incrementing it's count by 1
		                charCountMap.put(c, charCountMap.get(c) + 1);
		                System.out.println(charCountMap.get(c));
		            }
		            else {
		 
		                // If char is not present in charCountMap,
		                // putting this char to charCountMap with 1 as it's value
		                charCountMap.put(c, 1);
		            }
	            }
	        }
	 
	        // Printing the charCountMap
	        Set<Character> keys= charCountMap.keySet();
	        for (char key : keys) {
//	            System.out.println(key + " " + charCountMap.get(key));
	        }
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
//	        String str = "GeeksForGeeks";
	    	String str = "Shyam is my Namea";
	        characterCount(str);
	    }

}
