package exceptionsdemo;

public class HowManySpaces {
	// a custom method to count all the spaces in a sentance (String)
	// input: String
	// output: int

	public static void main(String[] args) {
		String spaces = "we need to be very serious about Java";
		System.out.println(getCountOfSpaces(spaces));
	}

	public static int getCountOfSpaces(String sentance) {
		int countOfSpace = 0;

		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i) == ' ') {
				countOfSpace++;
			}
		}

		return countOfSpace;
	}
}
