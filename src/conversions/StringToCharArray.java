package conversions;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getCharArrayFromString("we are happy boys")));

	}

	public static char[] getCharArrayFromString(String sentance) {

		char[] charArray = sentance.toCharArray();

		return charArray;

	}

}
