package demo;

import java.util.Scanner;

public class TimeSeries {
	public static int num;
	public static int mul;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt() + 1;

		System.out.println("Enter a multiple : ");
		mul = sc.nextInt();

		System.out.println("Output of the Time Series: ");
		for (int i = 1; i < num; i++) {
			System.out.println(i + " * " + mul + " = " + (i * mul));
		}

	}
}
