package conv;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListToStackConversion {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(34);
		list.add(45);
		list.add(56);
		list.add(67);
		list.add(78);
		list.add(89);
		list.add(90);
		
		Stack<Integer> myStack = new Stack<>();
	
		myStack.addAll(list);     // Converting a list to a Stack
		System.out.println("Converted Stack : " + myStack);
	}
}

Output:
Converted Stack : [12, 23, 34, 45, 56, 67, 78, 89, 90]
