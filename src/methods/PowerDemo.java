package conv;

import java.util.Scanner;

public class PowerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Enter a power: ");
		int p = sc.nextInt();
		int result = 1;

		if (n >= 0 && p == 0) {
			result = 1;
		} else if (n == 0 && p >= 1) {
			result = 0;
		} else {
			for (int i = 1; i <= p; i++) {
				result = result * n;
			}
		}
		System.out.println(n + "^" + p + " is : " + result);
		sc.close();
	}
}
