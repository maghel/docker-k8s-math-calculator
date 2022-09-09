package com.mazeit.mathcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;
import java.util.function.Function;

@SpringBootApplication
public class MathApplication {

	private Map<String, MathOp> mathOps = Map.of(
			"add", new Addition(),
			"sub", new Subtraction(),
			"div", new Divide(),
			"mul", new Multiply());

	public static void main(String[] args) {
		SpringApplication.run(MathApplication.class, args);
	}

	@Bean
	public Function<String, MathOp> mathOpsFunction() {
		return op -> {
			return mathOps.get(op);
		};
	}

}
