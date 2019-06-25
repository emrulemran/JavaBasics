package arrdemo;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] numbers = { 3, 4, 5, 2, 10 };
		int sum = 0;
		for (int x : numbers) {
			sum += x;
		}
		System.out.println(sum);
	}
}
