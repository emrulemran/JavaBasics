package arraydemo;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAnArray {
	public static void main(String[] args) {

		Integer numbers[] = { 400, 300, 500, 100, 200 };
		System.out.println("Before soring the Array : " + Arrays.toString(numbers));

		Arrays.sort(numbers, Comparator.reverseOrder());

		System.out.println("After soring the Array DESC : " + Arrays.toString(numbers));

		Arrays.sort(numbers);

		System.out.println("After soring the Array ASC : " + Arrays.toString(numbers));

	}
}
