package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

public class SetLoopWithoutIterator {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<String>();

		mySet.add("New York");
		mySet.add("Boston");
		mySet.add("Miami");
		mySet.add("Philadelphia");
		mySet.add("Raleigh");

		for (String element : mySet) {
			System.out.println(element);
		}
	}
}
