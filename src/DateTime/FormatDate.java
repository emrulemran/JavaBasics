package exceptionsdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("Today's date is: " + date.toString());

		
		// Formatting date in a specified pattern as in argument 
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
	    String str = sdf.format(new Date()); 
	    System.out.println("Formatted Date : " + str); 
	  
	    // parsing a given String 
	    str = "12/18/2020"; 
	    sdf = new SimpleDateFormat("MM/dd/yyyy"); 
	    Date date1 = sdf.parse(str); 
	  
	    // this will print the date as per parsed string 
	    System.out.println("Parsed Date : " + date1); 
		
	}

}
