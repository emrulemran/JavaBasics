package collectionsdemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackDemos {
	public static void main(String args[]) {
		Stack<String> stk = new Stack<String>();
		stk.add("Ostrich");
		stk.add("Iguana");
		stk.add("Boa");
		stk.add("Crocodile");
		stk.add("Zebra");
		stk.add("Jackle");
		stk.add("Anaconda");
		stk.add("Tapir");
		System.out.println(stk);
		stk.pop(); // removes the first one
		System.out.println(stk); // the first one removed

		Collections.sort(stk, Collections.reverseOrder());
		Iterator<String> itr = stk.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

Output:
[Ostrich, Iguana, Boa, Crocodile, Zebra, Jackle, Anaconda, Tapir]
[Ostrich, Iguana, Boa, Crocodile, Zebra, Jackle, Anaconda]
Zebra
Ostrich
Jackle
Iguana
Crocodile
Boa
Anaconda
