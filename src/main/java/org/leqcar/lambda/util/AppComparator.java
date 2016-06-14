package org.leqcar.lambda.util;

import java.util.Comparator;

import org.leqcar.lambda.Apple;

public class AppComparator {

	public static void main(String[] args) {
		Comparator<Apple> byWeight = new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.compareTo(o2);
			}
			
		};
	}

}
