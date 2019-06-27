package vectordemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String args[]) {

		Vector<String> cities = new Vector<String>(2);
		cities.addElement("New York");
		cities.addElement("Buffalo");
		cities.addElement("Miami");
		cities.addElement("Austin");
		System.out.println("The size of the Vector is: " + cities.size());

		System.out.println("Default or current capacity of the vector is: " + cities.capacity());

		cities.addElement("Fort Lauderdale");
		cities.addElement("Mount Laurel");
		cities.addElement("Manhattan");

		System.out.println("Size of the Vector after adding elements: " + cities.size());
		System.out.println("Current capacity after adding elements is: " + cities.capacity());

		// print elements:
		for(String ele :cities) {
			System.out.println(ele);
		}
		// another way of printing elements: 
		Enumeration en = cities.elements();
		System.out.println("\nElements are:");
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");

	}
}

Output:
The size of the Vector is: 4
Default or current capacity of the vector is: 4
Size of the Vector after adding elements: 7
Current capacity after adding elements is: 8
New York
Buffalo
Miami
Austin
Fort Lauderdale
Mount Laurel
Manhattan

Elements are:
New York Buffalo Miami Austin Fort Lauderdale Mount Laurel Manhattan 
