package org.leqcar.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by JONGT on 6/12/2016.
 */
public class FilterSample {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("Red")
                , new Apple("Blue")
                , new Apple("Green"));

        List<Apple> redApple = filter(inventory,
                p -> "Red".equals(p.getColor()));

        System.out.println(redApple);
    }

    interface Predicate<T> {
        boolean test(T t);
    }

    public static <T>List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
