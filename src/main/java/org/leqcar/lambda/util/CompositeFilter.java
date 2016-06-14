package org.leqcar.lambda.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JONGT on 6/13/2016.
 */
public class CompositeFilter<T> implements Filter<T> {

    private List<T> filters;

    public CompositeFilter(List<T> filters) {
        this.filters = filters;
    }

    @Override
    public List<T> result(Evaluator<T> e) {
        List<T> result = new ArrayList<T>();
        for (T t: filters) {
            if (e.evaluate(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
