package exceldemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CsvWriter {

	public static void main(String[] args) throws IOException {
  
  // row data
		List<List<String>> rows = Arrays.asList(
			    Arrays.asList("Jean", "author", "Java"),
			    Arrays.asList("David", "editor", "Python"),
			    Arrays.asList("Scott", "editor", "Node.js")
			);

			FileWriter csvWriter = new FileWriter("/Users/mymbp/Desktop/test.csv");

  // column headers     
			csvWriter.append("Name");

  // separator
			csvWriter.append(",");   
			csvWriter.append("Role");
			csvWriter.append(",");
			csvWriter.append("Topic");
			csvWriter.append("\n");

			for (List<String> rowData : rows) {
			    csvWriter.append(String.join(",", rowData));
			    csvWriter.append("\n");
			}

			csvWriter.flush();
			csvWriter.close();

	}

}
