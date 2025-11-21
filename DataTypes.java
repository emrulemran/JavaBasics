package testcodes;

public class DataTypes {

	static int i = 0;

	int printNum() {
		return i++;
	}

	public static void main(String[] args) {

		System.out.println("direct static: " + i);

		DataTypes obj1 = new DataTypes();
		int x = obj1.printNum();
		System.out.println("first instance: " + x);

		DataTypes obj2 = new DataTypes();
		int y = obj2.printNum();
		System.out.println("second instance: " + y);
		
		DataTypes obj3 = new DataTypes();
		int z = obj3.printNum();
		System.out.println("third instance: " + z);


	
	}

}
