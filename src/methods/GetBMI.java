// *** A parameterized method with a return type: ***

package exceptionsdemo;

import java.util.Scanner;

public class GetBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your weight in Kg: ");
		double wt = sc.nextDouble();

		System.out.println("Please enter your height in Meter: ");
		double ht = sc.nextDouble();
		System.out.printf("Your BMI is: %4.2f!", getBmi(wt, ht));

	}

	public static double getBmi(double weightInKg, double heightInMeter) {
		double bmi = weightInKg / (heightInMeter * heightInMeter);
		return bmi;
	}
}
