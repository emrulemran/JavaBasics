package exceldemo;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadAllFromExcel {
	public static void main(String[] args) throws Exception {
		File src = new File("/Users/mypc/Desktop/ExcelJava.xls");
		Workbook wb = Workbook.getWorkbook(src);
		Sheet sh1 = wb.getSheet(0);

		int rows = sh1.getRows();
		int columns = sh1.getColumns();

		System.out.println("How many rows: " + rows);
		System.out.println("How many columns: " + columns);

		String readData [][] = new String[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell c = sh1.getCell(j, i);
				readData[i][j] = c.getContents();
				
				System.out.println(readData[i][j] + " : ");
			}
		}

	}
}
