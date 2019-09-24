package javacollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapReverse {
	public static void main(String args[]) {


// Note: Collections.reverseOrder() inside the constructor:
		Map<Integer, String> myTreeMap = new TreeMap<Integer, String>(Collections.reverseOrder());

		myTreeMap.put(6, "Sixth");
		myTreeMap.put(4, "Fourth");
		myTreeMap.put(1, "First");
		myTreeMap.put(8, "Eighth");
		myTreeMap.put(5, "Fifth");
		myTreeMap.put(2, "Second");
		myTreeMap.put(3, "Third");
		myTreeMap.put(7, "Seventh");

		Set mySet = myTreeMap.entrySet();

		Iterator<Object> it = mySet.iterator();

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
	}
}

Output:
8 : Eighth
7 : Seventh
6 : Sixth
5 : Fifth
4 : Fourth
3 : Third
2 : Second
1 : First
