package seleniumdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {
	private static final String COMMA_DELIMITER = ",";

	public static void main(String args[]) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("/Users/mymbp/Desktop/addresses.csv"));
			scanner.useDelimiter(COMMA_DELIMITER);
			while (scanner.hasNext()) {
				System.out.print(scanner.next() + "   ");
			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
