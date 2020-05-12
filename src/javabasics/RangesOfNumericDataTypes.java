package test;

public class RangesOfNumericDataTypes {
	static Byte b = 10;
	static Short s = 10;
	static Integer i = 10;
	static Long l = 10L;
	static Float f = 10.00f;
	static Double d = 10.00;

	public static void main(String[] args) {

		System.out.println(b.getClass().getSimpleName() + ": min value: " + b.MIN_VALUE + " max value: " + b.MAX_VALUE);
		System.out.println(s.getClass().getSimpleName() + ": min value: " + s.MIN_VALUE + " max value: " + s.MAX_VALUE);
		System.out.println(i.getClass().getSimpleName() + ": min value: " + i.MIN_VALUE + " max value: " + i.MAX_VALUE);
		System.out.println(l.getClass().getSimpleName() + ": min value: " + l.MIN_VALUE + " max value: " + l.MAX_VALUE);
		System.out.println(f.getClass().getSimpleName() + ": min value: " + f.MIN_VALUE + " max value: " + f.MAX_VALUE);
		System.out.println(d.getClass().getSimpleName() + ": min value: " + d.MIN_VALUE + " max value: " + d.MAX_VALUE);

	}

}
