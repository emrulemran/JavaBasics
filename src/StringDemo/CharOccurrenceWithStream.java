package stringdemo;

public class CharOccurrenceWithStream {

	public static long count(String s, char ch) {

		return s.chars().filter(c -> c == ch).count();
	}

	public static void main(String args[]) {
		String str = "we are happy boys ever and forever";
		char c = 'a';
		System.out.println("The count of < " + c + " > is : " + count(str, c));
	}
}


Output:
The count of < a > is : 3
