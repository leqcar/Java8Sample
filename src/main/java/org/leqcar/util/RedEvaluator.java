package org.leqcar.util;

import org.leqcar.lambda.Apple;

/**
 * Created by JONGT on 6/13/2016.
 */
public class RedEvaluator implements Evaluator<Apple> {

    @Override
    public boolean evaluate(Apple apple) {
        return "red".equals(apple.getColor());

    }
}
