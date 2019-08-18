package strings;

import java.util.ArrayList;
import java.util.List;

public class RepeatedCharacters {

	public static void main(String[] args) {
		System.out.println(getRepeatedCharList("we are happy boys"));
	}

	public static List<Character> getRepeatedCharList(String text) {

		text = text.toLowerCase();  


		List<Character> charList = new ArrayList<Character>();

		for (int i = 0; i < text.length(); i++) {
			for (int j = i + 1; j < text.length(); j++) {

				char firstLetter = Character.valueOf(text.charAt(i));
				char secondLetter = Character.valueOf(text.charAt(i));

				if (firstLetter == secondLetter) {
					if (!(firstLetter == ' ') && !charList.contains(firstLetter)) {

						charList.add(firstLetter);
					}
				}
			}

		}
		return charList;
	}
}
