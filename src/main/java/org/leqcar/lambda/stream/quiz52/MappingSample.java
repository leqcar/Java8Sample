package org.leqcar.lambda.stream.quiz52;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jongtenerife on 02/07/2016.
 */
public class MappingSample {

    public static void main(String[] args) {

        //1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result =
            numbers.stream()
                    .map(i ->  i * i)
                    .collect(Collectors.toList());

        System.out.println(result);

        //2

        List<Integer> numbersA = Arrays.asList(1,2,3);
        List<Integer> numbersB = Arrays.asList(3,4);

        List<int[]> resultPair =
                numbersA.stream()
                        .flatMap(i -> numbersB.stream()
                                    .map(j -> new int[]{i, j}))
                        .collect(Collectors.toList());

    }
}
