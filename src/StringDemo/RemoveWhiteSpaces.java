package testcodes;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String inputText = "Java automation";

        String output ="";

        for(int i = 0; i<=inputText.length() -1; i++){

            if(inputText.toCharArray()[i] != ' '){
                output+=inputText.toCharArray()[i];
            }
        }
        System.out.println(output);
    }
}
