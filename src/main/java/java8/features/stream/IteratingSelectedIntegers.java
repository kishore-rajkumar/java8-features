package java8.features.stream;

import java.util.stream.*;

public class IteratingSelectedIntegers {

	public static void main(String[] args) {

		Stream.iterate(1, count -> count + 1).filter(n -> n % 3 == 0).limit(10).forEach(x -> {
			System.out.print(" " + x);
		});

	}

}
