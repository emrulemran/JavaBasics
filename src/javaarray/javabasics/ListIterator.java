package traversal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListIterator {
	public static void main(String[] args) {

		Iterator<String> litr = null;
		List<String> names = new ArrayList<String>();
		names.add("Shyam");
		names.add("Rajat");
		names.add("Paul");
		names.add("Tom");
		names.add("Kate");


		litr = names.listIterator();

		System.out.println("Traversing the list in forward direction:");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("\nTraversing the list in backward direction:");
		while (((java.util.ListIterator<String>) litr).hasPrevious()) {
			System.out.println(((java.util.ListIterator<String>) litr).previous());
		}
	}
}
