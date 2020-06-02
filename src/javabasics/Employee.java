package constr;

public class Employee {
	int id;

	String name;
	String company;

	Employee() {
		System.out.println("default - no argument constructor");
	}

	Employee(int id) {
		this.id = id;
		System.out.println("Parameterized constructor");
	}

	Employee(int id, String name, String company) {
		this.id = id;
		this.name = name;
		this.company = company;

	}

	public void print() {
		System.out.println("print method starts . . .");
		System.out.println(id);
		System.out.println(name);
		System.out.println(company);
		System.out.println("print method ends . . .");

	}

}


package constr;

public class Employee {
	int id;

	String name;
	String company;

	Employee() {
		System.out.println("default - no argument constructor");
	}

	Employee(int id) {
		this.id = id;
		System.out.println("Parameterized constructor");
	}

	Employee(int id, String name, String company) {
		this.id = id;
		this.name = name;
		this.company = company;

	}

	public void print() {
		System.out.println("print method starts . . .");
		System.out.println(id);
		System.out.println(name);
		System.out.println(company);
		System.out.println("print method ends . . .");

	}

}
