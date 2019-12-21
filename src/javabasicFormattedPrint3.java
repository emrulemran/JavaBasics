package randompack;

import java.text.NumberFormat;

public class javabasicFormattedPrint3 {

	public static void main(String[] args) {

		// currency format:
		NumberFormat dollarAmount = NumberFormat.getCurrencyInstance();
		String formattedDollarAmount = dollarAmount.format(1234.565);
		System.out.println(formattedDollarAmount);

		// percentage format:

		NumberFormat perc = NumberFormat.getPercentInstance();
		String percentage = perc.format(1);
		System.out.println(percentage);
	}

}
