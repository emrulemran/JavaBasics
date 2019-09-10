package javacollections;

import java.util.*;

public class LinkedListDemo {

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

		// printing all the values of the LinkedList:
		System.out.println("LinkedList elements: " + numll);

		// adding an element at a specified index position:
		numll.add(3, 100);

		// what is at 3rd index position?
		System.out.println("3rd index has: " + numll.get(3));

		// printing the size (how many elements it holds):
		System.out.println("Size is: " + numll.size());

		// adding an element at a specified index position (0):
		numll.add(0, 1000);

		System.out.println("Now, the size is: " + numll.size());

		numll.add(3, 100);
		numll.addFirst(22);
		numll.addLast(37);

		// printing all elements:
		System.out.println("Elements of the LinkedList: " + numll);

		// 1st way to iterate or traverse through elements:
		System.out.print("Printing elements using Iterator: ");
		Iterator<Integer> it = numll.iterator();
		while (it.hasNext()) {
			int num = it.next();
			System.out.print(num + " ");
		}

		System.out.println();

		// 2nd way to iterate or traverse through elements:
		System.out.print("Printing elements using for loop: ");
		for (int i = 0; i < numll.size(); i++) {
			System.out.print(numll.get(i) + " ");
		}

		System.out.println();
		// 3rd way:
		System.out.println("Printing elements using forEach method: ");
		numll.forEach(System.out::println);
		System.out.println();

		// 4th way:
		System.out.print("Printing elements using Lambda expression: ");
		numll.forEach(n -> System.out.print(n + " "));
		System.out.println();

		// sorting in an ascending order:
		Collections.sort(numll);
		System.out.println("Ascending order: " + numll);

		// sorting in a reverse (descending) order:
		Collections.reverse(numll);
		System.out.println("Descending order: " + numll);

		// clear the LinkedList:
		numll.clear();
		System.out.println("Everything cleared up:" + numll);

	}

}


Output:
LinkedList elements: [12, 45, 56, 87, 62, 95, 16, 57]
3rd index has: 100
Size is: 9
Now, the size is: 10
Elements of the LinkedList: [22, 1000, 12, 45, 100, 56, 100, 87, 62, 95, 16, 57, 37]
Printing elements using Iterator: 22 1000 12 45 100 56 100 87 62 95 16 57 37 
Printing elements using for loop: 22 1000 12 45 100 56 100 87 62 95 16 57 37 
Printing elements using forEach method: 
22
1000
12
45
100
56
100
87
62
95
16
57
37

Printing elements using Lambda expression: 22 1000 12 45 100 56 100 87 62 95 16 57 37 
Ascending order: [12, 16, 22, 37, 45, 56, 57, 62, 87, 95, 100, 100, 1000]
Descending order: [1000, 100, 100, 95, 87, 62, 57, 56, 45, 37, 22, 16, 12]
Everything cleared up:[]
