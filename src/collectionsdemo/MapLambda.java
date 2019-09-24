package javacollections;

import java.util.HashMap;
import java.util.Map;

public class MapLambda {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "First");
		myMap.put(2, "Second");
		myMap.put(3, "Third");
		myMap.put(4, "Fourth");
		myMap.put(5, "Fifth");
		myMap.put(6, "Sixth");

		myMap.forEach((x, y) -> System.out.println("Key " + x + ": " + "Value: " + y));

	}

}
