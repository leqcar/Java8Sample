package org.leqcar.util;

import org.leqcar.lambda.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by JONGT on 6/13/2016.
 */
public class AppFilter {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple("blue", 51),
                new Apple("red", 60),
                new Apple("purple", 40),
                new Apple("red", 70));

        Evaluator<Apple> evaluator = new RedEvaluator();
        Filter<Apple> filter = new CompositeFilter<>(inventory);

        System.out.println(filter.result(evaluator));

        //in lambda
        List<Apple> result = inventory.stream()
                                    .filter( f -> "red".equals(f.getColor()))
                                    .collect(Collectors.toList());
        System.out.println(result);
    }
}
