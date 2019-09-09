package arraydemo;

import java.util.HashSet;
import java.util.Set;

public class ArrayCommonValues {

	public static void main(String[] args) {

		int[] nums1 = { 12, 43, 65, 87, 89, 23, 54, 86, 15, 45, 87, 98, 76 };
		int[] nums2 = { 21, 33, 65, 78, 98, 23, 44, 56, 35, 34, 54, 45, 76 };

		Set<Integer> mySet = new HashSet<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) { // for String: if(nums1[i].equals(numss2[j]))
					mySet.add(nums1[i]);
				}
			}
		}

		System.out.println(mySet);

	}
}

Output: [65, 98, 54, 23, 76, 45]
