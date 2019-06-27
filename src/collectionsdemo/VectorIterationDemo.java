package vectordemo;

import java.util.Vector;
import java.util.ListIterator;
import java.util.Iterator;

public class VectorIterationDemo {
	public static void main(String[] args) {

		Vector<Integer> intVector = new Vector<Integer>();

		intVector.addElement(01);
		intVector.add(12);
		intVector.add(23);
		intVector.add(34);
		intVector.add(45);
		intVector.add(56);

		Iterator<Integer> vectorIterator = intVector.iterator();

		System.out.println("The elememts of the Vector are:");
		while (vectorIterator.hasNext()) {
			System.out.println(vectorIterator.next());
		}
	}
}


Output:
The elememts of the Vectorare:
1
12
23
34
45
56
