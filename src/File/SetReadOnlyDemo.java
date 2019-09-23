package filesdemo;

import java.io.File;
import java.io.IOException;

public class SetReadOnlyDemo {

	public static void main(String[] args) throws IOException {
		File myfile = new File("/Users/mymbp/Desktop/newfile.txt");

		boolean flag = myfile.setReadOnly();
		if (flag == true) {
			System.out.println("File property changed to Read-only.");
		} else {
			System.out.println("Unsuccessful Operation!!");
		}
	}
}
