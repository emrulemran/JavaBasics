package javademo;

import java.util.Scanner;

public class FormattedPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");

		String name = sc.next();
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();

		String message = String.format("Hello, %s, next year your age will be: %d", name, (age + 1));
		System.out.println(message);
		sc.close();  // closes 
		
		
		
		// size of output double value: 7
		// decimal places: 2
		System.out.printf("Price:%9.2f", 10000.00 / 3.00);

		System.out.println();

		// size of output double value: 12
		// decimal places: 5
		System.out.printf("Price:%(,12.5f", 10000.00 / 3.00);

		System.out.println();

		// negative output value comes inside a pair of parentheses (accounting style):
		System.out.printf("Price:%(,12.5f", -10000.00 / 3.00);

	}

}
