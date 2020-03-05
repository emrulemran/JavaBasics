package methodsdemo;

import java.util.Scanner;

public class FactorialUpto25 {
	public static int input;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		long mul = 1;

		if ((input >= 1) && (input <= 25)) {
			for (int i = 1; i < input + 1; i++) {
				mul = mul * i;
			}
			System.out.println("The factorial of " + input + " is : " + mul);

		} else {
			System.out.println("The Number is too big or zero!");
		}

	}
}
