package com.parser.Expressions.Customs;

import com.parser.Expressions.Expression;
import com.parser.Expressions.Value;

/**
 * Created on 9/05/2016.
 */
public class AND_Expression extends Expression {

    Expression left;
    Expression right;

    public AND_Expression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String show() {
        return left.show()+" AND " + right.show();
    }

    @Override
    public Value evaluate() throws EvaluateError {
        Value lv = left.evaluate();
        Value rv = right.evaluate();
        Value[] lr = Value.convert(new Value[] {lv, rv});

        Double ret = (double) (((long) lr[0].value) & ((long) lr[1].value));

        return new Value(ret,lr);
    }
}
