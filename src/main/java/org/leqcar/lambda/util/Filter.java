package org.leqcar.lambda.util;

import java.util.List;

/**
 * Created by JONGT on 6/13/2016.
 */
public interface Filter<T> {

    List<T> result(Evaluator<T> t);
}
