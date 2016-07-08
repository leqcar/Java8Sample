package org.leqcar.lambda.util;

import java.util.Arrays;
import java.util.List;

import org.leqcar.lambda.Apple;

public class AppComparator {

	public static void main(String[] args) {
		
        List<Apple> inventory = Arrays.asList(
                new Apple("blue", 51),
                new Apple("red", 60),
                new Apple("purple", 40),
                new Apple("red", 70));
        
//		Comparator<Apple> byWeight = new Comparator<Apple>() {
//
//			@Override
//			public int compare(Apple o1, Apple o2) {
//				return o1.compareTo(o2);
//			}
//			
//		};
		
        inventory.sort((Apple o1, Apple o2) -> o2.getWeight().compareTo(o1.getWeight()));
        System.out.println(inventory);
	}

}
