package filesdemo;

import java.io.File;
import java.io.IOException;

public class FileClassPractice {
	public static void main(String[] args) throws IOException {
		// creating an object of the file class
		File f1 = new File("/Users/mymbp/Desktop/myfolder");

		// create a directory
		f1.mkdir();

		if (f1.exists() == true) {
			System.out.println("the folder exists");
		} else {
			System.out.println("a folder has been created");
		}

		// delete a directory
		f1.delete();

		File f2 = new File("/Users/mymbp/Desktop/myfolder/text.txt");
		f2.createNewFile();

	}
}
