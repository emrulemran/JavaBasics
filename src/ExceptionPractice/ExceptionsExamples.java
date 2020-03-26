package testpack;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class ExceptionsExamples {

	public static void main(String[] args) {
		// #1 Arithmetic exception:
		int x = 19;
		int y = 0;
		int division = x / y;
		System.out.println(division);

		// # 2 StringIndexOutOfBoundsException:
		String city = "newyorkcity";
		System.out.println(city.substring(1, 15));
		System.out.println(city.charAt(13));

		// #3 ArrayIndexOutOfBoundsException:
		String[] names = { "Jonh", "Jane", "Jinna", "Jenny", "Joanna" };
		System.out.println(names[5]);

		// #4 NullPointerException:
		String anything = null; 
		System.out.println(anything.length());

		// #5 NumberFormatException:
		String number = "12dfd34";
		int convertedNumber = Integer.parseInt(number);
		System.out.println(convertedNumber);

		// #6 and 7 ClassNotFoundException and SQLException:
		Class.forName("com.mysql.cj.jdbc.Driver");			            // ClassNotFoundException 
		Connection conn = DriverManager.getConnection("abasfdfd", "root", "4444");  // SQLException
		Statement st = conn.createStatement();
		ResultSet rset = st.executeQuery("we are happy learners");                   // SQLException

		// #8 InterruptedException:
		Thread.sleep(5000);

		// 9 and 10 FileNotFoundException and IOException:
		File file = new File("C:\\Users\\aaaa\\dddd\\demo.txt");  	// FileNotFoundException - invalid file path
		FileImageInputStream fis = new FileImageInputStream(file);	// IOException
		System.out.println(fis);

		// #11 IllegalFormatConversionException:
		int DegreesF;
		double DegreesC;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a whole number as Farenheit: ");
		DegreesF = keyboard.nextInt();
		DegreesC = (5 * (DegreesF - 32)) / 9;
		System.out.printf(DegreesF + " degree Farenheit is equal to " + "%2.2f", DegreesC + " degree Celcius");
	}
}
