package bubblesort;

public class BubbleSortDemo {

	public static void main(String[] args) {

		int[] intArray = { 2, 3, 6, 2, 1, 0, 6, 9, 4 };
		System.out.println("Before sorting . . .");

		for (int i : intArray) {
			System.out.println(i);
		}

		bubbleSort(intArray);
		System.out.println("After sorting . . .");
		for (int i : intArray) {
			System.out.println(i);
		}

	}

	private static void bubbleSort(int[] intArray) {
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 1; j < (intArray.length) - i; j++) {
				if (intArray[j - 1] > intArray[j]) {
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
	}
}
