package java8.features.optionalclass;

import java.util.Optional;

public class IfPresentAndIsPresentMethods {

	public static void main(String[] args) {

		// Creating Optional object from a non-null String
		Optional<String> GOT = Optional.of("Game of Thrones");

		// Optional.empty() creates an empty Optional object
		Optional<String> nothing = Optional.empty();

		if (GOT.isPresent()) {
			System.out.println(GOT);
		} else {
			System.out.println("No GoT!");
		}

		/*
		 * ifPresent() method: It executes only if the given Optional object is
		 * non-empty.
		 */

		// This will print as the GOT is non-empty
		GOT.ifPresent(s -> System.out.println("GOT is present, watching now!"));

		// This will not print as the nothing is empty
		nothing.ifPresent(s -> System.out.println("Nothing to watch, bored!"));

	}

}
