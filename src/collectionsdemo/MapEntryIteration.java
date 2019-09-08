package collectionspractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapEntryIteration {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "Java is the first choice");
		mp.put(2, "Scala is the second choice");
		mp.put(3, "Python is the third choice");

		Iterator<Entry<Integer, String>> iterator = mp.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> thisEntry = (Entry<Integer, String>) iterator.next();
			Object key = thisEntry.getKey();
			Object value = thisEntry.getValue();
			System.out.println(key + " : " + value);

		}
	}
}

Output:
1 : Java is the first choice
2 : Scala is the second choice
3 : Python is the third choice
