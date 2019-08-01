package test.java;

public class AlternateCases {

	public static void main(String[] args) {
		String sentence = "we are happy boys!";
		String newSentence = "";
		System.out.println("Original sentence: " + sentence);

		for (int i = 0; i < sentence.length(); i++) {
			char currentChar = sentence.charAt(i);
			if ((i % 2) == 0) {
				newSentence += Character.toUpperCase(currentChar);
			} else {
				newSentence += Character.toLowerCase(currentChar);
			}
		}
		System.out.println("Alternate cases for new sentance: " + newSentence);
	}
}
