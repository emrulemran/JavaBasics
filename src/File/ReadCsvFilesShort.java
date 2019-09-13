// The following code has 4 lines to read and print from a *.csv file


package exceldemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class ReadCsvFilesShort {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("/Users/mymbp/Desktop/addresses.csv"));
		String line = " ";                            // ---> or a null String
		while ((line = br.readLine()) != null) {
			System.out.println(Arrays.toString(line.split(",")));
		}
		br.close();
	}

}
