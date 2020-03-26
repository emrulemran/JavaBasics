package sp;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String value = null;
		Optional op = Optional.ofNullable(value);
		if (op.isPresent()) {
			System.out.println(value);
		} else {
			System.out.println("null is present");
		}
		
		OptionalDemo od = new OptionalDemo();
// or	OptionalDemo od = null;
		Optional o = Optional.ofNullable(od);
		if(o.isPresent()) {
			System.out.println("There is an object of this class");
		}else {
			System.out.println("null object");
		}
	}
}
