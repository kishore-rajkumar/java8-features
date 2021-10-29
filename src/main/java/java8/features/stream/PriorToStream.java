package java8.features.stream;

import java.util.ArrayList;
import java.util.List;

public class PriorToStream {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		
		int count = 0;
		
		for(String s: names) {
			if(s.length()<6) {
				count++;
			}
		}
		
		System.out.println("There are " + count +" names with less than 6 letters");

	}

}
