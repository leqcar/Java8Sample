package org.leqcar.lambda.util;

import java.util.Arrays;
import java.util.List;

public class AppNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
//		for (Integer num : numbers) {
//			System.out.println(num);
//		}
	
//		numbers.forEach((Integer t) -> System.out.println(t));
		
//		numbers.forEach(System.out::println);
		
		int result = 0;
		for (Integer num : numbers) {
			result += num;
		}
		System.out.println(result);

	}

}
