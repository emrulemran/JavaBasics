package exceptionsdemo;

public class FormattedPrint2 {
	public static void main(String args[]) {
		int x = 123456;

		// %d : decimal integer, \n : new line
		System.out.printf("Plain integer: x = %d\n", x);

		// %.2f : 2 decimal places
		System.out.printf("Value of PI upto 2 decimal places: %.2f\n", Math.PI);

		float n = 5.2f;

		// .4f : 4 decimal places
		System.out.printf("Formatted to specific width: n = %.4f\n", n);

		n = 2324435.3f;
		// %20: output size, .4f : 4 decimal places
		System.out.printf("Formatted to right margin: n = %20.4f\n", n);
	}
}


Output:
Plain integer: x = 123456
Value of PI upto 2 decimal places: 3.14
4 decimal places: n = 5.2000
Output size is 20 with 4 decimal places: n =        2324435.2500
