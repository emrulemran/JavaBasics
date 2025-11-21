package testcodes;

public class AccessStaticVariable {

	// can we access static variable from static and non-static method? YES
	static String name = "Malaika";

	static void printName() {
		System.out.println(name + " : from a static method");
	}

	void printNames() {
		System.out.println(name + " : from a non-static or instance method");
	}

	public static void main(String[] args) {

		printName(); // static method

		AccessStaticVariable obj = new AccessStaticVariable();
		obj.printNames(); // non-static or instance method

	}

}
