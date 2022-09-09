package com.mazeit.mathcalc;

import java.math.BigInteger;

public class Addition implements MathOp {
    @Override
    public BigInteger op(BigInteger operand1, BigInteger operand2) {
        return operand1.add(operand2);
    }
}
