package vectordemo;

import java.util.Vector;
import java.util.ArrayList;

public class VectorToArrayList {

	public static void main(String[] args) {

		Vector<String> cars = new Vector<String>();

		cars.add("Nissan");
		cars.add("Alpha Romeo");
		cars.add("McLauren");
		cars.add("Eicher");
		cars.add("Jeep");
		cars.add("Vespa");

		// Vector to ArrayList conversion
		ArrayList<String> carArrayList = new ArrayList<String>(cars);
		System.out.println(carArrayList);
	}
}

Output: [Nissam, Alpha Romeo, McLauren, Eicher, Jeep, Vespa]
