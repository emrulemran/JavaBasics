package javalambda;

public interface StringConcat {

public String sconcat(String a, String b);

  }


package javalambda;

public class StringConcatLambda {

	public static void main(String args[]) {
		StringConcat s = (str1, str2) -> str1 + str2;
		System.out.println("Final String : " + s.sconcat("Hello ", "World"));
	}
}
