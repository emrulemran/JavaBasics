package collectionsdemo;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		double[] anArray = { 32, 12, 43, 56, 67, 78, 89, 2, 4, 59, 66, 68 };
		double sum = 0.0;
		for (int i = 0; i < anArray.length; i++) {
			sum += anArray[i];
		}
		
		System.out.println("The sum of array elements: " + sum);
		System.out.println("Total number of array elements: " + anArray.length);
		double average = sum / anArray.length;
		System.out.format("The average is: %.4f", average);
	}
}

Output:
The sum of array elements: 576.0
Total number of array elements: 12
The average is: 48.0000
