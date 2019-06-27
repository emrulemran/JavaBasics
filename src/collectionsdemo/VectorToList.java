package vectordemo;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorToList {

	public static void main(String[] args) {

		Vector<String> vBirds = new Vector<String>();

		vBirds.add("Dove");
		vBirds.add("Pigeon");
		vBirds.add("Falcon");
		vBirds.add("Eagle");
		vBirds.add("Robin");
		vBirds.add("Magpie");
		List<String> bList = Collections.list(vBirds.elements());
		System.out.println(bList);

	}
}



Output: [Dove, Pigeon, Falcon, Eagle, Robin, Magpie]
