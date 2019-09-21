package filesdemo;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModificationTimeStamp {
	public static void main(String[] args) {

		File file = new File("/Users/mymbp/Desktop/newfile.txt");
		// MM = month, mm = minute, a = am or pm

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
		System.out.println("Last Modification timestamp: " + sdf.format(file.lastModified()));
	}
}
