package java8.features.streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndMapMethod {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> squares = num.stream() // create stream from list
				.map(i -> i * i) // map and transform each element into its squares
				.collect(Collectors.toList()); // collect the stream and convert into list

		squares.forEach(System.out::println);

	}

}
