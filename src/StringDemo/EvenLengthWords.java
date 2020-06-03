package test;

public class EvenLengthWords {
	public static void printWords(String s) {
		for (String word : s.split(" "))
			if (word.length() % 2 == 0)
				System.out.println(word);
	}

	public static void main(String[] args) {
		String s = "we are happy boys ever and ever after";
		printWords(s);
	}
}

Output:
we
boys
ever
ever
