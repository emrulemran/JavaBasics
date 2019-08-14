package methodsdemo;

import java.util.Scanner;

public class RecursiveMethodFactorial {

	static int factorial(int n) {
		if (n != 0) {
			return n * factorial(n - 1); // recursive call
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int result = factorial(number);
		System.out.println(number + " factorial = " + result);
	}
}
