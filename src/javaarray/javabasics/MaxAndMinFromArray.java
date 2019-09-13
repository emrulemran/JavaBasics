// Here is a method to find the minimum value from an int array
// Maximum value could be found with slight modifications

package collectionsdemo;

public class MaxAndMinFromArray {

	public static void main(String[] args) {
		int[] numbers = { 12, 34, 65, 76, 87, 43, 2, 3, 68, 64, 32, 35, 68, 654 };
		System.out.println(getMinValue(numbers));
	}

	public static int getMinValue(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}

		}

		return min;

	}

}
