

// *** An example of a void, parameter-less method. *** 

package javademo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VolumeOfCube {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a value for the side of a cube : ");
		String value = br.readLine();
		System.out.println("The size of a side is: " + value);

		int num = Integer.parseInt(value);

		cubeVolume(num);

	}

	public static void cubeVolume(int value) {

		int cube = value * value * value;
		System.out.println("The volume of the cube is: " + cube);

	}
}
