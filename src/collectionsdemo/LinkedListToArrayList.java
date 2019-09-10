package javacollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {

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
		System.out.println("This is a LinkedList of Integers:     " + numll);

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i : numll) {
			al.add(i);
		}

		System.out.println("This is an ArrayList of Integers:     " + al);
	}

}


Output:
This is a LinkedList of Integers:     [12, 45, 56, 87, 62, 95, 16, 57]
This is an ArrayList of Integers:     [12, 45, 56, 87, 62, 95, 16, 57]
