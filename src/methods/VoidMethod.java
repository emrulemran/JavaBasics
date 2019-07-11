package methodsdemo;

public class VoidMethod {

	public static void main(String[] args) {
		getResult(73);
	}

	public static void getResult(int marks) {
		if (marks >= 0 && marks <= 30) {
			System.out.println("Failed");
		} else if (marks > 30 && marks <= 60) {
			System.out.println("C grade");
		} else if (marks > 60 && marks <= 80) {
			System.out.println("B grade");
		} else if (marks > 80 && marks <= 100) {
			System.out.println("A grade");
		} else if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks");
		}
	}
}
