package intldemo;

import java.util.Locale;

public class CountriesAndLangs {

	public static void main(String[] args) {

		for (Object c : Locale.getISOCountries()) {
			System.out.println(c);
		}

		for (Object c : Locale.getISOLanguages()) {
			System.out.println(c);
		}
		
	}

}
