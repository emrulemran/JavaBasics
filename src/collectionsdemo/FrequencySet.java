package traversal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FrequencySet {
	public static void main(String agrs[]) {

		Set<String> newSet = new HashSet<String>();   // set contains unique values, so the frequency must be 1 for all items
		newSet.add("boston");
		newSet.add("chicago");
		newSet.add("woodside");
		newSet.add("jamaica");
		newSet.add("woodside");
		newSet.add("chicago");
		newSet.add("woodside");
		newSet.add("dallas");
		newSet.add("woodside");
		newSet.add("saltlake");
		newSet.add("detroit");
		newSet.add("miami");
		newSet.add("woodside");
		newSet.add("dallas");
		newSet.add("woodside");
		
		System.out.println(newSet);

		System.out.println("woodside is found : " + Collections.frequency(newSet, "woodside") + " times");
	}
}
