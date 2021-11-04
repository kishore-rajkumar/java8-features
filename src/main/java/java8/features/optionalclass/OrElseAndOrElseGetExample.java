package java8.features.optionalclass;

import java.util.Optional;

public class OrElseAndOrElseGetExample {

	public static void main(String[] args) {

		// Creating Optional object from a String
		Optional<String> GOT = Optional.of("Game of Thrones");

		// Creating Optional empty object
		Optional<String> nothing = Optional.empty();

		System.out.println(GOT.orElse("GOT orElse - default"));
		System.out.println(nothing.orElse("nothing orElse - default"));

		System.out.println();

		System.out.println(GOT.orElseGet(() -> "GOT oeElseGet - default"));
		System.out.println(nothing.orElseGet(() -> "nothing orElseGet default"));
		
	}

}
