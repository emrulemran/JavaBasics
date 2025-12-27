package beginnersbook;

import java.util.Scanner;

public class SumTwoNums {
    public static void main(String[] args) {


        // using 2 int variables:
        int numA = 12, numB = 15, sum;
        sum = numA + numB;
        System.out.println("Sum of " + numA + " and " + numB + " is: " + sum);

        // using Scanner:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));


        // Add two non-integer numbers:

        double x, y, result;

        System.out.println("Enter a decimal value: ");
        x = sc.nextDouble();
        System.out.println("Enter another decimal value: ");
        y = sc.nextDouble();

        System.out.println("The sum of " + x + " and " + y + " is: " + (x + y));
        sc.close();
    }
}
