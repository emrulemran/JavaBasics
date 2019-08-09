package collectionsdemo;

import java.util.ArrayList;

public class ArrayListsCompare {

	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("aeroplane");
		array1.add("rocket");
		array1.add("jet");
		array1.add("chopper");
		array1.add("car");
		array1.add("usb");
		array1.add("truck");
		array1.add("train");
		array1.add("taxi");
		System.out.println("The first arrayList: " + array1);

		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("aeroplane");
		array2.add("rocket");
		array2.add("jet");
		array2.add("chopper");
		array2.add("truck");
		array2.add("train");
		array2.add("taxi");
		System.out.println("The second arrayList: " + array2);

		ArrayList<String> array3 = new ArrayList<String>();
		for (String temp : array1)
			array3.add(array2.contains(temp) ? "Yes" : "No");
		System.out.println(array3);

		ArrayList<Integer> array4 = new ArrayList<Integer>();
		for (String temp2 : array1)
			array4.add(array2.contains(temp2) ? 1 : 0);
		System.out.println(array4);
	}
}

Output:
[Yes, Yes, Yes, Yes, No, No, Yes, Yes, Yes]
[1, 1, 1, 1, 0, 0, 1, 1, 1]
