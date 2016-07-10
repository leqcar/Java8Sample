package org.leqcar.util;

import java.util.function.Function;

/**
 * Created by jongtenerife on 19/06/2016.
 */
public class Letter {

    public static String addHeader(String text) {
        return "From Jong, Qeng and Deriq: " + text;
    }

    public static String addFooter(String text) {
        return text + "Kind regards";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda", "lambda");
    }

    public static void main(String[] args) {

        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> transformationPipeline = addHeader
                .andThen(Letter::checkSpelling)
                .andThen(Letter::addFooter);

        System.out.printf("Message: "+transformationPipeline.apply("labda!"));
    }
}
