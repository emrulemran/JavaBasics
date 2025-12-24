package learns;

public class DuplicatesinArray {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 56, 3, 56, 67, 34, 65, 45, 78, 34 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);

				}
			}
		}
	}

}
