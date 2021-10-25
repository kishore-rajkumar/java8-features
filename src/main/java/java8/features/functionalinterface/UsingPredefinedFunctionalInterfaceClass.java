package java8.features.functionalinterface;

import java.util.function.IntBinaryOperator;

public class UsingPredefinedFunctionalInterfaceClass {

	public static void main(String[] args) {
		//Pre-defined Functional Interface
		IntBinaryOperator i = (a, b) -> a + b;

		System.out.println("Pre-defined FI Result: " + i.applyAsInt(20, 35));
	}

}
