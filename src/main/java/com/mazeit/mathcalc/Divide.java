package com.mazeit.mathcalc;

import java.math.BigInteger;

public class Divide implements MathOp {
    @Override
    public BigInteger op(BigInteger operand1, BigInteger operand2) {
        return operand1.divide(operand2);
    }
}
