package javaarray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String forward = br.readLine();
            String reverse = new StringBuilder(forward).reverse().toString();
            if (forward.compareTo(reverse) == 0) {
                System.out.println(forward + " is a palindrome!");
            } else {
                System.out.println(forward + " is NOT a palindrome :(");
            }
        } catch (Exception ex) {
        }
    }
}