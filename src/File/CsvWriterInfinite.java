package exceldemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CsvWriterInfinite {

	public static void main(String[] args) throws IOException {
		List<List<String>> rows = Arrays.asList(
			    Arrays.asList("Jean", "author", "Java"),
			    Arrays.asList("David", "editor", "Python"),
			    Arrays.asList("Scott", "editor", "Node.js")
			);

			FileWriter csvWriter = new FileWriter("/Users/ruma/Desktop/test.csv");
			csvWriter.append("Name");
			csvWriter.append(",");
			csvWriter.append("Role");
			csvWriter.append(",");
			csvWriter.append("Topic");
			csvWriter.append("\n");

		for (;;) {
			for (List<String> rowData : rows) {
			    csvWriter.append(String.join(",", rowData));
			    csvWriter.append("\n");
			}

		}

		


	}

}
