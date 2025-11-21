package testcodes;

public class DataTypes2 {
	int a = 1111; // instance variable, cleared by GC
	static String name = "nyc"; // disposed when execution done, shared to all the objects and methods

	// local method example:  // once the method is done
	void localVariable() {		
		int i = 100;
		System.out.println(i);
		
		System.out.println("static variable from instance method: " + name);
	}
	
	
	// static method can be called directly
	
	static void printName() {
		System.out.println("John");
	}

	public static void main(String[] args) {

/* 8 primitive data types:
byte, short, int, long, float, double, char and boolean
String is not a primitive data type, its an object
*/		
		
		DataTypes2 dtObj = new DataTypes2();
		DataTypes2 dtObj1 = new DataTypes2();
		
		dtObj.localVariable();
		System.out.println(dtObj.a);
		System.out.println(dtObj1.a);
		// using a new keyword
		
		System.out.println("Value of a using new keyword: " + new DataTypes2().a);
		
		
		System.out.println(DataTypes2.name);
		
		// static method
		
		printName(); // directly
		DataTypes2.printName();
		

	}

}
