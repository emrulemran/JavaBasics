package javademo;

public class CountNumberOfDigit {
    static int count;
    public static void main(String[] args) {
        int input = 311593726;
        while (input != 0) {
             input = input/10;
             // this work input /= 10;
            ++count;
        }
        System.out.println("Number of digits in an integer: " + count);
    }
}
