package demos;

public class PassByReference {
	public static void main(String[] args) {
		Test t = new Test();
		pbr(t);
		System.out.println(t.testName);

	}

	public static void pbr(Test test) {
		test.testName = "albuquerque";
	}

}

class Test {

	String testName;

}
