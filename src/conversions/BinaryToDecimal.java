package conversions;

import java.util.Scanner;

public class BinaryToDecimalConversion {

    public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("Please enter a binary number: ");
        
		String string = scanner.nextLine();
        
		System.out.println(Integer.parseInt(string, 2));
        
		scanner.close();
	}
    
}
