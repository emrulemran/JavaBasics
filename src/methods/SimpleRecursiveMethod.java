package methodsdemo;

public class SimpleRecursiveMethod {

	public static void main(String[] args) throws Exception {
		neverEnd();
	}

	public static void neverEnd() throws Exception {
		Thread.sleep(5000);
		System.out.println("A recursive method that never ends!");
		neverEnd();
	}
}



Output: 
A recursive method that never ends!
A recursive method that never ends!
A recursive method that never ends!
A recursive method that never ends!
A recursive method that never ends!
A recursive method that never ends!
A recursive method that never ends!
                                    .....
