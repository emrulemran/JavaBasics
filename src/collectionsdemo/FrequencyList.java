package traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("boston");
		names.add("chicago");
		names.add("woodside");
		names.add("jamaica");
		names.add("woodside");
		names.add("chicago");
		names.add("woodside");
		names.add("dallas");
		names.add("woodside");
		names.add("saltlake");
		names.add("detroit");
		names.add("miami");
		names.add("woodside");
		names.add("dallas");
		names.add("woodside");
		System.out.println(names);
		System.out.println("woodside is found : " + Collections.frequency(names, "woodside") + " times");
	}
}
