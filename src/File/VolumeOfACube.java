package exceldemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VolumeOfACube {

	public static void cubeValue(double value) {
		double cube = Math.pow(value, 3); // or double cube = value * value * value;
		System.out.println("The volue of the cube is: " + cube);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// orScanner sc = new Scanner(System.in);

		System.out.println("Please enter a value: ");
		String value = br.readLine();
		// or, String value = sc.next();;
		double num = Integer.parseInt(value);
		cubeValue(num);
	}
}
