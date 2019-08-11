package datetime;

import java.util.Date;

public class DateDemo {

	// import from: java.util.Date - not fronjava.sql.Date

	public static void main(String args[]) {

		Date date = new Date(); // Instantiate an object from Date class

		System.out.println("Date and Time: "+date.toString()); // display time and date using toString()
	}
}


Output:
Date and Time: Sat Aug 10 23:36:28 EDT 2019
