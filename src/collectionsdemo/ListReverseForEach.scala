package collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverseForEach {

	public static void main(String[] args) {
		List<String> flowers = new ArrayList<>();
		flowers.add("tulip");
		flowers.add("rose");
		flowers.add("lily");
		flowers.add("lotus");
		flowers.add("jasmine");

		// flowers.forEach(System.out::println);
		System.out.println("Before reverse: ");
		flowers.forEach((flower) -> System.out.println(flower));
		Collections.reverse(flowers);
		// flowers.forEach(System.out::println);

		System.out.println("After reverse: ");
		flowers.forEach((flower) -> System.out.println(flower));
	}

}
