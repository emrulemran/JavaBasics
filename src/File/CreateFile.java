package filesdemo;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File file = new File("/Users/mymbp/Desktop/newfile.txt");

			boolean hasTheFileBeenCreated = file.createNewFile(); // false by default
			if (hasTheFileBeenCreated) {
				System.out.println("Successfully created newfile.txt");
			} else {
				System.out.println("File newfile.txt already created");
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
	}
}
