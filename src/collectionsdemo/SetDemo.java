package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		/*
		 * Set is an interface of the HashSet class. Set never contains duplicate elements.
		 */

		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(11);
		mySet.add(22);
		mySet.add(33);
		mySet.add(33);
		System.out.println(mySet.size());

		Iterator<Integer> it = mySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println("Set doesn't hold duplicates: " + mySet);
		System.out.println(mySet.remove(11)); // 11 has been removed
		System.out.println(mySet);
		// check if this set contains 22

		System.out.println("Does mySet contains 22? Answer: " + mySet.contains(22));

		// after clearing:
		mySet.clear();
		System.out.println("Nothing is left after clearing: " + mySet);

		System.out.println(mySet.isEmpty()); // isEmpty check if the set is Empty

	}

}
