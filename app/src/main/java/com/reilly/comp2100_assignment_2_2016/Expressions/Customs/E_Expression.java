package com.reilly.comp2100_assignment_2_2016.Expressions.Customs;

import com.reilly.comp2100_assignment_2_2016.Expressions.Expression;
import com.reilly.comp2100_assignment_2_2016.Expressions.Value;

/**
 * Created by ***REMOVED*** on 9/05/2016.
 */
public class E_Expression extends Expression {

    public E_Expression() {}

    @Override
    public String show() {
        return "e";
    }

    @Override
    public Value evaluate() throws EvaluateError {
        return new Value(Math.E);
    }
}
