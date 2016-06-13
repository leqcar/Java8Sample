package org.leqcar.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by JONGT on 6/13/2016.
 */
public class ApplePrint {

    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(
                new Apple("blue", 51),
                new Apple("red", 60),
                new Apple("purple", 40));

        prettyPrintApple(inventory, new ApplePrintHeavyColor());

        //in lambda
        prettyPrintApple(inventory
                , p -> {
                    String weight = p.getWeight() > 50 ? "heavy" : "light";
                    return String.format("A %s %s apple.", weight, p.getColor());
                });

    }

    public static final void prettyPrintApple(List<Apple> inventory
            , AppleFormatter formatter) {

        for (Apple apple: inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    interface AppleFormatter {

        String accept(Apple apple);
    }

    static class ApplePrintHeavyColor implements AppleFormatter {

        @Override
        public String accept(Apple apple) {
            String weight = apple.getWeight() > 50 ? "heavy" : "light";
            return String.format("A %s %s apple.", weight, apple.getColor());
        }
    }
}
