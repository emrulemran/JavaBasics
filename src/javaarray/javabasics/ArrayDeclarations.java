package arraydemo;

import java.util.Arrays;

public class ArrayDeclarations {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		numbers[3] = 44;
		numbers[4] = 55;

		String[] flowers = { "lily", "rose", "tulip", "daisy", "rhubarb" };

		double[] amounts = new double[] { 2.3, 2.5, 3.141, 25.75, 2.99 };

		System.out.println("Values of numbers array: " + Arrays.toString(numbers));
		System.out.println("Values of flowers array: " + Arrays.toString(flowers));
		System.out.println("Values of amounts array: " + Arrays.toString(amounts));

	}

}


Output:
Values of numbers array: [11, 22, 33, 44, 55]
Values of flowers array: [lily, rose, tulip, daisy, rhubarb]
Values of amounts array: [2.3, 2.5, 3.141, 25.75, 2.99]
