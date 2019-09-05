package demo;

import java.awt.Toolkit;

public class Beeps {

	public static void main(String[] args) throws InterruptedException {
		

		for (;;) {
			Toolkit.getDefaultToolkit().beep();
			Thread.sleep(2000);
		}
	}

}
