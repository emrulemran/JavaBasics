package lambda.test;

import java.util.HashMap;
import java.util.Map;

public class MapLambda {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "Java is the first choice");
		mp.put(2, "Scala is the second choice");
		mp.put(3, "Python is the third choice");
		mp.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}


Output:
1 : Java is the first choice
2 : Scala is the second choice
3 : Python is the third choice
