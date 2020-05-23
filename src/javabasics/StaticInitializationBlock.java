package sib;

public class StaticInitializationBlock {
	static int age = myMethod();
	static {
		System.out.println("SIB 1 Begin");
		main(null);
		System.out.println("SIB 1 End");
	}

	static int myMethod() {
		System.out.println("myMethod()");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("main()");
		System.out.println("age : " + age);
	}

	static {
		System.out.println("SIB 2 Begin");
		main(null);
		System.out.println("SIB 2 End");
	}
}
