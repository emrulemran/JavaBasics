package collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class MapMaxValue {

	public static int getMaxValue(Map<String, Integer> map) {
		int min = 0;
		for (int value : map.values()) {

			if (value > min) {
				min = value;

			}
		}
		return min;
	}

	public static void main(String[] args) {

		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("a", 10);
		mp.put("b", 190);
		mp.put("c", 45);
		mp.put("d", 650);
		mp.put("e", 76);
		mp.put("f", 595);
		mp.put("g", 74);

		System.out.println(getMaxValue(mp));
	}
}
