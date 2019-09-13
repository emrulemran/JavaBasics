package collectionsdemo;

import java.util.Vector;

public class VectorMaxAndMin {     // onle max shown here

	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		v.add(new Double("3.43"));
		v.add(new Double("9.57"));
		v.add(new Double("13.32"));
		v.add(new Double("33.39"));
		v.add(new Double("29.32"));
		System.out.println(getMax(v));

	}

	public static double getMax(Vector<Double> v) {

		double max = v.get(0);
		for (int i = 0; i < v.size(); i++) {
			if (max < v.get(i)) {
				max = v.get(i);

			}

		}

		return max;

	}
}
