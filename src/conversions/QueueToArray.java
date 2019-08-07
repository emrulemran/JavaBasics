package conv;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueToArray {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.add("new york");
		queue.add("boston");
		queue.add("buffalo");
		queue.add("dallas");
		queue.add("houston");
		queue.add("plano");
		queue.add("hartfod");
		queue.add("richmond");
		queue.add("albuquerque");
		queue.add("tulouse");

		String[] strArray = queue.toArray(new String[queue.size()]);
		System.out.println("The array is: " + Arrays.toString(strArray));

	}
}



Output:
The array is: [new york, boston, buffalo, dallas, houston, plano, hartfod, richmond, albuquerque, tulouse]
