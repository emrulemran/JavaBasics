package iteratordemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorNextAndPrevious {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("We");

		list.add("are");

		list.add("happy");
		list.add("boys");

		ListIterator<String> listIterator = list.listIterator();
		System.out.println("ListIterator Next: ");
		while (listIterator.hasNext()) {
			Object a = listIterator.next();

			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println();
		System.out.println("ListIterator Previous: ");
		while (listIterator.hasPrevious()) {
			Object b = listIterator.previous();

			System.out.print(b + " ");
		}
	}
}

Output:
ListIterator Next: 
We are happy boys 

ListIterator Previous: 
boys happy are We 
