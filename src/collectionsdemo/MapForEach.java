package javacollections;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "First");
		myMap.put(2, "Second");
		myMap.put(3, "Third");
		myMap.put(4, "Fourth");
		myMap.put(5, "Fifth");
		myMap.put(6, "Sixth");
		
		for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		
	}

}

Output:
Item : 1 Count : First
Item : 2 Count : Second
Item : 3 Count : Third
Item : 4 Count : Fourth
Item : 5 Count : Fifth
Item : 6 Count : Sixth
