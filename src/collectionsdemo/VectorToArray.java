package vectordemo;

import java.util.Vector;

public class VectorToArray {

	public static void main(String[] args) {

		Vector<String> vBirds = new Vector<String>();

		vBirds.add("Dove");
		vBirds.add("Pigeon");
		vBirds.add("Falcon");
		vBirds.add("Eagle");
		vBirds.add("Robin");
		vBirds.add("Magpie");

		String[] items = vBirds.toArray(new String[vBirds.size()]);
		System.out.println("String Array Elements :");
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}
}


Output:
String Array Elements :
Dove
Pigeon
Falcon
Eagle
Robin
Magpie
