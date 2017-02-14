package integerpractice;


public class IntFromString {
    static char c;
    static String a = "";

    public static void main(String[] args) {
        String input = "We arer3sdsd4 4 q 420fddfk";

        System.out.println(getChars(input) + 5);
    }

    public static int getChars(String input) {
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (Character.isDigit(c)) {
                a += c;
            }
        }
        return Integer.parseInt(a);
    }
}

