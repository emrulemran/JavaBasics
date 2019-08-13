package stringdemo;

public class StringToIntLeadingZeros {
	public static void main(String args[]) {
		String str = "00000678";
		str = String.format("%08d", Integer.parseInt(str) + 102);
		System.out.println("Output String: " + str);
	}
}


Output: 
Output String: 00000780
