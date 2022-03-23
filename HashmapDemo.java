package HashMaps;
import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create an empty hash map by declaring object
		        // of string and integer type
		        HashMap<String, Integer> map = new HashMap<>();
		 
		        // Adding elements to the Map
		        // using standard add() method
		        map.put("vishal", 10);
		        map.put("sachin", 30);
		        map.put("vaibhav", 20);
		 
		        // Print size and content of the Map
		        System.out.println("Size of map is:- "
		                           + map.size());
		 
		        // Printing elements in object of Map
		        System.out.println(map);
		 
		        // Checking if a key is present and if
		        // present, print value by passing
		        // random element
		        if (map.containsKey("vishal")) {
		 
		            // Mapping
		            Integer a = map.get("vishal");
		 
		            // Printing value fr the corresponding key
		            System.out.println("value for key"
		                               + " \"vishal\" is:- " + a);
		        }
		    }
}
