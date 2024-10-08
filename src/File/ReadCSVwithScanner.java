package codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVwithScanner {

	public static void main(String[] args) throws FileNotFoundException {

		File inputCsvFile = new File("C:\\Users\\datafiles\\movies.csv");

		Scanner sc = new Scanner(inputCsvFile);

		sc.useDelimiter(",");

		while (sc.hasNext()) {
			System.out.print(sc.next() + "|");
		}
		sc.close();
	}

}
