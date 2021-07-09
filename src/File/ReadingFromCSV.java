import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadingFromCSV {

	public static void main(String[] args) throws IOException, CsvException {

		String fileName = "C:\\Users\\ABC\\Desktop\\citycsv.csv";
		try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
			List<String[]> r = reader.readAll();
			r.forEach(x -> System.out.println(Arrays.toString(x)));
		}
	}
}


/*

  <dependency>
			<groupId>com.opencsv</groupId>
			<artifactId>opencsv</artifactId>
			<version>5.3</version>
	</dependency>


*/
