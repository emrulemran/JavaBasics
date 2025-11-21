package testcodes;

public class InstanceVariableInsideStaticMethod {

	int num = 10;
	

	public static void printNum() {
		InstanceVariableInsideStaticMethod ob = new InstanceVariableInsideStaticMethod();
		System.out.println(ob.num);
	}
	
	
	public static void main(String[] args) {
	
		printNum();
	}	
}

