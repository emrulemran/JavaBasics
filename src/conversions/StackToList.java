package conv;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackToList {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		myStack.add(12);
		myStack.add(23);
		myStack.add(34);
		myStack.add(45);
		myStack.add(56);
		myStack.add(67);
		myStack.add(78);
		myStack.add(89);
		myStack.add(90);
		List<Integer> list = new ArrayList<>();
		list.addAll(myStack);
		System.out.println("Stack elements: " +myStack);
		System.out.println("List elements : " + list);
	}
}


Output:
Stack elements: [12, 23, 34, 45, 56, 67, 78, 89, 90]
List elements : [12, 23, 34, 45, 56, 67, 78, 89, 90]
