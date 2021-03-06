package com.parser.Expressions.Customs;

import com.parser.Expressions.Expression;
import com.parser.Expressions.Value;

/**
 * Created by reill_000 on 14/05/2016.
 */
public class NOT_Expression extends Expression {

    Expression parameter;

    public NOT_Expression(Expression child) {
        this.parameter = parameter;
    }
    @Override
    public String show() {
        return "NOT";
    }

    @Override
    public Value evaluate() throws EvaluateError {
        Value left = parameter.evaluate();

        Double ret = (double) ~((long) left.value);
        //if(Double.isNaN(ret)) throw new EvaluateError("Invalid value for not");

        return new Value(ret,left);
    }
}
