package com.mazeit.mathcalc;

import java.math.BigInteger;

public class Multiply implements MathOp {
    @Override
    public BigInteger op(BigInteger operand1, BigInteger operand2) {
        return operand1.multiply(operand2);
    }
}
