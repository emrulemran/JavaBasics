package learns;

import java.util.HashMap;

public class RepeatChar {

	public static void main(String[] args) {

		String s = "pennsylvannia";

		char[] a = s.toCharArray();

		int count = 1;

		HashMap<Character, Integer> newObj = new HashMap();

		for (int i = 0; i < a.length; i++) {
			if (!newObj.containsKey(a[i])) {
				newObj.put(a[i], count);

			} else {
				newObj.put(a[i], newObj.get(a[i]) + 1);

			}
		}

		for (Character k : newObj.keySet()) {
			System.out.println(k + " : " + newObj.get(k));
		}
	}

}
