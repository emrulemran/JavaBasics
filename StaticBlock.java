package codes;

public class StaticBlock {
	public static void name() {
		System.out.println("abc");
	}

	static {
		System.out.println("shahed");
	}

	static {
		System.out.println("emran");
	}

	{
		int b = 10;
		System.out.println("instance blocks");
	}

	{
		int b = 10;

		System.out.println("instance blocks2");
	}

	public static void main(String[] args) {
		name();
		StatiBlock ob = new StatiBlock();

	}
}
