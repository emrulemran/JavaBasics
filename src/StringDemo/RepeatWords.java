package learns;

import java.util.HashMap;

public class RepeatWords {

	public static void main(String[] args) {

		String s = "pennsylvannia is a very very good good state in the united state";

		String [] a = s.split(" ");

		int count = 1;

		HashMap<String, Integer> newObj = new HashMap();

		for (int i = 0; i < a.length; i++) {
			if (!newObj.containsKey(a[i])) {
				newObj.put(a[i], count);

			} else {
				newObj.put(a[i], newObj.get(a[i]) + 1);

			}
		}

		for (String k : newObj.keySet()) {
			System.out.println(k + " : " + newObj.get(k));
		}
	}

}
