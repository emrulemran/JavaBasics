package collectionsdemo;

public class TwoDArray {
	public static void main(String[] args) {
		String[][] sArray = { { "abc", "cde", "def", "fgh", "ghi", "hij", "ijk" },
				{ "mno", "nop", "opq", "pqr", "qrs", "rst", "stu" } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(sArray[i][j] + " ");

			}
		}
	}
}
