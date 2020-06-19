package inher;


class ClassA {
	String cityName;
	int zipCode;

}

public class ClassB extends ClassA {
	int foundingYear;

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.cityName = "New York City";
		ca.zipCode = 11011;

		System.out.println("The name of the city is: " + ca.cityName);
		System.out.println("The name of the city is: " + ca.zipCode);

		ClassB ba = new ClassB();
		ba.cityName = "The Big Apple!";
		ba.foundingYear = 1624;
		ba.zipCode = 10202;
		

		System.out.println("The name of the city is: " + ba.cityName);
		System.out.println("The zip code of the city is: " + ba.zipCode);
		System.out.println("The founding year of the city is: " + ba.foundingYear);

	}

}

Output:
The name of the city is: New York City
The name of the city is: 11011
The name of the city is: The Big Apple!
The zip code of the city is: 10202
The founding year of the city is: 1624
