package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sapin");
		map.put(2, "Biju");
		map.put(3, "");
		map.put(4, "Nepal");
		map.put(9, "Naveen");
		map.put(10, "Nabil");
		map.put(5, "Kalam");
		map.put(6, "Nikhil");
		map.put(7, "Samir");
		map.put(8, "Agni");
		System.out.println(map);
		System.out.println("Is this map empty? " + map.isEmpty());

		System.out.println(map.values());
		System.out.println(map.toString());

		Map<Integer, String> anotherMap = new HashMap<Integer, String>();

		map.putAll(anotherMap);
		System.out.println("Another Map values: " + anotherMap);

		System.out.println(map.values()); // prints all the values - not the keys
		System.out.println(map.keySet()); // prints all the keys - not the values

		System.out.println("Print entry set:" + map.entrySet());

		System.out.println("The size of the Map is: " + map.size());

		System.out.println("Is there a value for key 3? " + map.containsKey(3)); // If the 3rd Key contains a value
		System.out.println("Is there a value - Agni? " + map.containsValue("Agni")); // If the value Agni is present

		System.out.println("Comparing two maps that contains exactly same set of keys and values : " + map.equals(map));

		System.out.println("Looping through map elements:");
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i)); // why null?
		}

		System.out.println("The HashCode of this map is : " + map.hashCode()); // HashCode is the memory reference of
																				// objects in the integer form
		System.out.println("Clearing a Map:");
		map.clear();
		System.out.println("Map cleared :" + map);

	}
}
