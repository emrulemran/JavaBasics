package stringdemo;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String input = in.next();

		System.out.print("The reverse is: ");

		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		System.out.println();
		in.close();
	}
}
