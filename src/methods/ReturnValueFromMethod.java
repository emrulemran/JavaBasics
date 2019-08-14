package methodsdemo;

public class ReturnValueFromMethod {

	public static void main(String[] args) {
		int result;
		result = square();                // getting value from the method
		System.out.println("The returned value of 8 x 10 is: " + result);
	}

	public static int square() {        // a method with a return value

		return 8 * 10;                    // return statement
	}
}


Output:
The returned value of 8 x 10 is: 80
