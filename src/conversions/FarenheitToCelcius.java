package conv;

import java.util.Scanner;

public class FarenheitToCelcius {

	public static void main(String[] args) {
		float temperature;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperature in degreee Fahrenheit: ");
		temperature = in.nextInt();
		temperature = ((temperature - 32) * 5) / 9;
		System.out.println("Temperature in degree Celsius : " + temperature);
		in.close();
	}
}
