package commit;

public class DefaultCharValue {
	static Character ch;

	public static void main(String[] args) {
		ch = new Character(Character.MIN_VALUE);
		char c = '\u0000';
		System.out.println(ch == c);
		System.out.println("So the dafault value of Character is: '\\u0000'");
	}

}
