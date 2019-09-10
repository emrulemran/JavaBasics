package javacollections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTOArray {

	public static void main(String[] args) {
		LinkedList<Integer> numll = new LinkedList<Integer>();
		numll.add(12);
		numll.add(45);
		numll.add(56);
		numll.add(87);
		numll.add(62);
		numll.add(95);
		numll.add(16);
		numll.add(57);
		System.out.println("This is a LinkedList of Integers: " + numll);
		int[] numArray = new int[numll.size()];

		for (int i = 0; i < numll.size(); i++) {

			numArray[i] = numll.get(i);

		}
		System.out.println("This is an Array of Integers:     " + Arrays.toString(numArray));
	}

}


Output:
This is a LinkedList of Integers: [12, 45, 56, 87, 62, 95, 16, 57]
This is an Array of Integers:     [12, 45, 56, 87, 62, 95, 16, 57]
