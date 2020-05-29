package demos;

public class ReturnByReferenceDemo {

	int number;

	static ReturnByReferenceDemo returnByRefernce() {
		System.out.println("returnByReference begins ...");
		ReturnByReferenceDemo rbr = new ReturnByReferenceDemo();
		System.out.println("number 1: " + rbr.number);

		rbr.number = 10;
		System.out.println("number 2: " + rbr.number);

		System.out.println("returnByReference ends ...");

		return rbr;

	}

	public static void main(String[] args) {
		ReturnByReferenceDemo ob = returnByRefernce();
		System.out.println("number 3: " + ob.number);
	}

}
