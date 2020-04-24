package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorCount {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "mango", "pomo", "banana", "orange", "apple");
		Long count = fruits.stream().collect(Collectors.counting());
		System.out.println(count);
	}
}
