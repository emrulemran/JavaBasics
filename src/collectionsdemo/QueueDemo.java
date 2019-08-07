package collectionspractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		queue.add("rose");
		queue.add("lily");
		queue.add("tulip");
		queue.add("jasmine");
		queue.add("jasmine");
		queue.add("pansy");
		queue.add("anemone");
		queue.add("sunflower");
		queue.add("rhododenron");
		queue.add("lilac");

		System.out.println(queue);

		queue.remove("lilac");
		System.out.println(queue);
		System.out.println("Queue Size: " + queue.size());
		System.out.println("Queue Contains element 'lilac' or not? : " + queue.contains("lilac"));

		// To empty the queue
		queue.clear();
	}
}
