// This code reads the input file character for character and prints the text from the input file


package exceldemo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadAFileAndPrint {

	public static void main(String[] args) throws IOException {
		File myfile = new File("/Users/mymbp/Desktop/LoremIpsum.txt");
		FileInputStream fis = new FileInputStream(myfile);
		BufferedInputStream bis = new BufferedInputStream(fis);

		while (bis.available() > 0) {
			System.out.print((char) bis.read());
		}
		bis.close();
	}

}
