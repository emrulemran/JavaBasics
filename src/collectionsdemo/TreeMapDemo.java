package javacollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {

		// ordered keys and corresponding values:
		Map<Integer, String> myTreeMap = new TreeMap<Integer, String>();
		myTreeMap.put(6, "Sixth");
		myTreeMap.put(4, "Fourth");
		myTreeMap.put(1, "First");
		myTreeMap.put(8, "Eighth");
		myTreeMap.put(5, "Fifth");
		myTreeMap.put(2, "Second");
		myTreeMap.put(3, "Third");
		myTreeMap.put(7, "Seventh");

		System.out.println("TreeMap is an Ordered Map: " + myTreeMap);

		System.out.println();

		Set set = myTreeMap.entrySet();

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mEntry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mEntry.getKey() + " & Value is: ");
			System.out.println(mEntry.getValue());
		}

	}
}
