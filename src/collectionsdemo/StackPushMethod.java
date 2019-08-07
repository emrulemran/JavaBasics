package collectionsdemo;

import java.util.Stack;

public class StackPushMethod {

	public static void main(String[] args) {
		Integer[] intArr = { 1001, 1002, 1003, 1004 };
		Stack<Integer> stack1 = new Stack<>();
		for (Integer i : intArr) {
			stack1.push(i);
		}
		System.out.println("Stack1 : " + stack1);

		Stack<Integer> stack2 = new Stack<>();
		for (int i = 0; i <= 100; i++) {
			stack2.push(i);
		}
		System.out.println("Stack2 : " + stack2);

	}

}


Output:
Stack1 : [1001, 1002, 1003, 1004]
Stack2 : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]

