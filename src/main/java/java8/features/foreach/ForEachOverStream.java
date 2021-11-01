package java8.features.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachOverStream {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Maggie");
		names.add("Michonne");
		names.add("Rick");
		names.add("Merle");
		names.add("Governor");

		names.stream() // create stream
				.filter(n -> n.startsWith("M")) // intermediate operation
				.forEach(System.out::println); // iterate each element and display
	}

}
