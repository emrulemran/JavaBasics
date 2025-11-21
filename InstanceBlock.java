package codes;

public class InstanceBlock {

	String PageName;
	{
		PageName = "Login Page";
		System.out.println("inst");
	}

	InstanceBlock() {
		System.out.println("After loginpage");

	}

	InstanceBlock(int a) {

		System.out.println("After login page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceBlock newobj = new InstanceBlock();
		InstanceBlock newobj1 = new InstanceBlock(10);

	}

}
