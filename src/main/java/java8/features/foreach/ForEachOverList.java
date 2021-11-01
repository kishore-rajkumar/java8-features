package java8.features.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachOverList {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Pear");
		fruits.add("Mango");

		fruits.forEach(System.out::println);

	}

}
