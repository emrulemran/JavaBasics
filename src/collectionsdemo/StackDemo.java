package collectionsdemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

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
		stk.pop();
		
		Collections.sort(stk, Collections.reverseOrder());
		
		Iterator<String> itr = stk.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
