package methodsdemo;

import java.util.Arrays;

public class SortingASubArray {
	public static void main(String[] args) {

		int[] nums = { 10, 33, 55, 71, 95, 49, 31, 13, 7, 6, 45, 21, 9, 2, 100 };

		Arrays.sort(nums, 1, 5);

		System.out.printf("Modified arr[] : %s", Arrays.toString(nums));
	}
}
