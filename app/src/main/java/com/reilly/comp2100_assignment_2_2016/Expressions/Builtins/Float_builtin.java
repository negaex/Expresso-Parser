package com.reilly.comp2100_assignment_2_2016.Expressions.Builtins;

import com.reilly.comp2100_assignment_2_2016.Expressions.Expression;
import com.reilly.comp2100_assignment_2_2016.Expressions.Value;

/**
 * Created by ***REMOVED*** on 9/05/2016.
 */
public class Float_builtin extends Expression {

    String value;

    public Float_builtin(String value) {
        this.value = value;
    }

    @Override
    public String show() {
        return value;
    }

    @Override
    public Value evaluate() throws EvaluateError {
        try {
            return new Value(Float.parseFloat(value));
        } catch (NumberFormatException e) {
            throw new EvaluateError("Invalid number");
        }
    }
}