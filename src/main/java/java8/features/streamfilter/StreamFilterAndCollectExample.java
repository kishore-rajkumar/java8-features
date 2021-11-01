package java8.features.streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndCollectExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

		List<String> longNames = names.stream() // create stream from list
				.filter(s -> s.length() > 6) // filter and return a new stream
				.collect(Collectors.toList()); // collect the filter stream and convert into a list

		longNames.forEach(System.out::println);

	}

}
