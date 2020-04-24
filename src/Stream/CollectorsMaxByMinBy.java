package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMaxByMinBy {
	public static void main(String[] args) {
		
		List<Integer> fruits = Arrays.asList(1, 2, 3, 15, 6, 17, 8);
    
    // use maxBy or MinBy:
		Optional<Integer> max1 = fruits.stream().collect(Collectors.minBy(Comparator.comparing(Integer::valueOf))); 		// Option 1
		
		Optional<Integer> max2 = fruits.stream().collect(Collectors.minBy(Integer::compareTo));                         // Option 2

		Optional<Integer> max3 = fruits.stream().collect(Collectors.minBy((i, j) -> i.compareTo(j)));                   // Option 3
		
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
	}
}
