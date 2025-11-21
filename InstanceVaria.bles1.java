package testcodes;

public class InstanceVariables1 {

	int k = 0;// instance variables
	
	// a specific variable of objects of the same class holds the same value

	void m1() {// instance method
		k++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariables1 newoobj1 = new InstanceVariables1();
		InstanceVariables1 newoobj2 = new InstanceVariables1();
		InstanceVariables1 newoobj3 = new InstanceVariables1();
		InstanceVariables1 newoobj4 = new InstanceVariables1();



		System.out.println("value from the first object: " + newoobj1.k);// static variable
		System.out.println("value from the second object: " + newoobj2.k);// static variable
		System.out.println("value from the third object: " + newoobj3.k);// static variable
		System.out.println("value from the fourth object: " + newoobj4.k);// static variable

	}
}
