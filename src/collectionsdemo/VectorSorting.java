package javacollections;

import java.util.Collections;
import java.util.Vector;

public class VectorSorting {

	public static void main(String[] args) {
		Vector cities = new Vector(5, 5);
		cities.add(new String("Greenbelt")); // declaring and sorting String objects
		cities.add(new String("Baltimore"));
		cities.add(new String("Philadelphia"));
		cities.add(new String("Yorkshire"));
		cities.add(new String("Orlando"));
		cities.add(new String("Phoenix"));
		cities.add(new String("Albuquerque"));
		System.out.println("Vector Elements as per insertion order :" + cities);
		Collections.sort(cities);
		System.out.println("Vector Elements sorted ascendingly :" + cities);

		Collections.reverse(cities);
		System.out.println("Vector Elements sorted descendingly :" + cities);
	}
}



Output:
Vector Elements as per insertion order :[Greenbelt, Baltimore, Philadelphia, Yorkshire, Orlando, Phoenix, Albuquerque]
Vector Elements Sorted ascendingly :[Albuquerque, Baltimore, Greenbelt, Orlando, Philadelphia, Phoenix, Yorkshire]
Vector Elements Sorted descendingly :[Yorkshire, Phoenix, Philadelphia, Orlando, Greenbelt, Baltimore, Albuquerque]
