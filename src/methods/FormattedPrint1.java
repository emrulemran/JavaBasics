package javademo;

import java.util.Scanner;

public class FormattedPrint1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");

		String name = sc.next();
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();

		String message = String.format("Hello, %s, next year your age will be: %d", name, (age + 1));
		System.out.println(message);
		sc.close();

	}

}
