package org.leqcar.lambda.fibonacci;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by jongtenerife on 09/07/2016.
 */
public class AppFibonacci {

    public static void main(String[] args) {

        //first sample
        Stream.iterate(0, n -> n + 2)
                .limit(20)
                .forEach(System.out::println);
        System.out.println("========== end first sample ========");

        Stream.iterate(new int[]{0,1},
                    f -> new int[]{ f[1], f[0] + f[1] })
                .limit(20)
                .forEach(v -> System.out.println("( " + v[0] + "," + v[1] + ")"));

        System.out.println("========== end of fibonacci quiz ========");
    }

}
