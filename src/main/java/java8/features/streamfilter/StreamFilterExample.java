package java8.features.streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

		// Creating the stream of all names
		Stream<String> allNames = names.stream();

		// Creating another stream by filtering long names using filter()
		Stream<String> longNames = allNames.filter(s -> s.length() > 6);

		// displaying the long names
		longNames.forEach(n -> System.out.println(n));

	}

}
