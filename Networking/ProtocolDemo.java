package netdemos;

import java.net.URL;

public class ProtocolDemo {

	public static void main(String[] args) {// url object
		URL url = null;

		try {
			url = new URL("https:// www.google.com");
			String protocol1 = url.getProtocol();
			System.out.println("URL = " + url);
			System.out.println("Protocol = " + protocol1);

			url = new URL("ftp:// www.google.org");
			String protocol2 = url.getProtocol();
			System.out.println("URL = " + url);

			System.out.println("Protocol = " + protocol2);
		}

		// if any error occurs
		catch (Exception e) {

			// display the error
			System.out.println(e);
		}
	}
}
