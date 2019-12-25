package mypackage;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleDemo {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("java");
		mylist.add("python");
		mylist.add("c");
		mylist.add("ruby");
		mylist.add("php");
		mylist.add("c-sharp");
		mylist.add("javascript");
		mylist.add("r");
		mylist.add("c++");

		System.out.println("List before shuffle: \n" + mylist);

		Collections.shuffle(mylist);

		System.out.println("\nList after shuffle : \n" + mylist);

	}

}
