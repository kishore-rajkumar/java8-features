package java8.features.stream;

import java.util.ArrayList;
import java.util.List;

public class PostStream {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");

		long count = names.stream().filter(s -> s.length() < 6).count();
		
		System.out.println("There are " + count +" names with less than 6 letters");
		
	}

}
