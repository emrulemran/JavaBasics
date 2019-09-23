package filesdemo;

import java.io.File;
import java.io.IOException;

public class IsHidden {

	public static void main(String[] args) throws IOException, SecurityException {

		File file = new File("/Users/mymbp/Desktop/newfile.txt");

		if (file.isHidden()) {
			System.out.println("The specified file is hidden");
		} else {
			System.out.println("The specified file is not hidden");
		}
	}
}
