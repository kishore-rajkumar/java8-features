package java8.features.stream;

import java.util.Arrays;
import java.util.List;

import java.util.stream.*;

public class ConcatenateStreams {

	public static void main(String[] args) {
		// list 1
		List<String> alphabets = Arrays.asList("A", "B", "C");

		// list 2
		List<String> names = Arrays.asList("Sansa", "Jon", "Arya");

		Stream<String> stream = Stream.concat(alphabets.stream(), names.parallelStream());

		stream.forEach(s -> System.out.print(s + " "));

	}

}
