package datetime;

import java.util.Date;

public class TimeDifference5Seconds {

	public static void main(String[] args) throws InterruptedException {

		for (;;) {
			Thread.sleep(5000);
			Date d = new Date();

			System.out.println(d.toString());

		}

	}

}


Output:
Sat Aug 10 23:42:50 EDT 2019
Sat Aug 10 23:42:55 EDT 2019
Sat Aug 10 23:43:00 EDT 2019
Sat Aug 10 23:43:05 EDT 2019
Sat Aug 10 23:43:10 EDT 2019
Sat Aug 10 23:43:15 EDT 2019
Sat Aug 10 23:43:20 EDT 2019
Sat Aug 10 23:43:25 EDT 2019
Sat Aug 10 23:43:30 EDT 2019
Sat Aug 10 23:43:35 EDT 2019
Sat Aug 10 23:43:40 EDT 2019
Sat Aug 10 23:43:45 EDT 2019
Sat Aug 10 23:43:50 EDT 2019
Sat Aug 10 23:43:55 EDT 2019
Sat Aug 10 23:44:00 EDT 2019
                              .....
                              .....
