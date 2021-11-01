package java8.features.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Maggie");
		names.add("Michonne");
		names.add("Rick");
		names.add("Merle");
		names.add("Governor");

		// forEach - the output would be in any order
		System.out.println("forEach - the output would be in any order");
		names.stream().parallel().forEach(System.out::println);

		System.out.println();

		// forEachOrdered - the output would be in the order of the source
		System.out.println("forEachOrdered - the output would be in the order of the source");
		names.stream().parallel().forEachOrdered(System.out::println);

	}

}
