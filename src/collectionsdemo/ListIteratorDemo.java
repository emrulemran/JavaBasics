package javacollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String a[]) {
		List<String> names = new ArrayList<String>();
		names.add("abc");
		names.add("bcd");
		names.add("cde");
		names.add("def");
		names.add("efg");
		names.add("fgh");
		names.add("ghi");
		names.add("hij");

		ListIterator<String> lIter = names.listIterator();

		System.out.print("List elements in forward direction : ");
		while (lIter.hasNext()) {
			System.out.print(lIter.next() + " ");
		}
		
		System.out.println();
		System.out.print("List elements in backward direction: ");
		while (lIter.hasPrevious()) {
			System.out.print(lIter.previous()+ " ");
		}
	}
}


Output:
List elements in forward direction : abc bcd cde def efg fgh ghi hij 
List elements in backward direction: hij ghi fgh efg def cde bcd abc 
