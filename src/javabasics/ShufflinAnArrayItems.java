package arrdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShufflinAnArrayItems {
	public static void main(String[] args) {

		String[] sArray = new String[] { "Apple", "Bee", "Corona", "Daisy", "Echidna", "Fuji", "Zinia" };

		List<String> listOfItems = Arrays.asList(sArray);

		Collections.shuffle(listOfItems);

		for (String element : listOfItems) {
			System.out.print(element + " ");
		}
	}
}
