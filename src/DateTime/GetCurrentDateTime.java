package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentDateTime {
	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("Today's date is: "+ sdf.format(date));

		Calendar cal = Calendar.getInstance();
		System.out.println("Today's date and time from calendar is: "+ sdf.format(cal.getTime()));

		LocalDateTime now = LocalDateTime.now();
		System.out.println("Local time now: "+dtf.format(now));

		LocalDate localDate = LocalDate.now();
		System.out.println("Formatted date and time is: "+ DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

	}

}


Output:
Today's date is: 2019/08/10 23:31:23
Today's date and time from calendar is: 2019/08/10 23:31:23
Local time now : 2019/08/10 23:31:23
Formatted date and time is: 2019/08/10
