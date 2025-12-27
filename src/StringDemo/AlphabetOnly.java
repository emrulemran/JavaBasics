package testcodes;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;

public class AlphabetOnly {

    public static void main(String[] args) {

        String inputText = "3850 NW 6th Street!";

        char [] chArr = inputText.toCharArray();

        for(int i=0; i<chArr.length; i++){
            if((isAlphabetic(chArr[i]) && !(isDigit(chArr[i]) && (!(chArr[i] == ' '))))) {

                System.out.print(chArr[i]);
            }
        }

    }
}
