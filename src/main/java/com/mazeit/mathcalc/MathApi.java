package com.mazeit.mathcalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.function.Function;

@RestController
public class MathApi {

    @Autowired
    Function<String, MathOp> mathOpsMapping;

    @GetMapping("/{operator}/{operand1}/{operand2}")
    BigInteger calc(@PathVariable String operator, @PathVariable BigInteger operand1, @PathVariable BigInteger operand2) {
        return mathOpsMapping.apply(operator).op(operand1, operand2);
    }
}
