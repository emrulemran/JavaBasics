package collectionsdemo;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> myDeque = new LinkedList<String>();
		myDeque.add("new york");
		myDeque.addFirst("boston");
		myDeque.addLast("miami");
		myDeque.push("richmond");
		myDeque.offer("wyoming");
		myDeque.offerFirst("lexington");
		myDeque.offerLast("hartford");
		System.out.println(myDeque + "\n");

		// Iterate through the queue elements.
		Iterator iterator = myDeque.iterator();
		while (iterator.hasNext())
			System.out.println("\t" + iterator.next());

		// Reverse order iterator
		Iterator reverse = myDeque.descendingIterator();
		System.out.println("Reverse Iterator");
		while (reverse.hasNext())
			System.out.println("\t" + reverse.next());

		// Peek returns the head, without deleting
		// it from the dequeue
		System.out.println("Peek " + myDeque.peek());
		System.out.println("After peek: " + myDeque);

		// Pop returns the head, and removes it from
		// the deque
		System.out.println("Pop " + myDeque.pop());
		System.out.println("After pop: " + myDeque);

		// We can check if a specific element exists
		// in the deque
		System.out.println("Contains Boston? " + myDeque.contains("boston"));

		// We can remove the first / last element.
		myDeque.removeFirst();
		myDeque.removeLast();
		System.out.println("Deque after removing " + "first and last: " + myDeque);

	}
}
