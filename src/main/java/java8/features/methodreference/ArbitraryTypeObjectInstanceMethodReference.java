package java8.features.methodreference;

import java.util.Arrays;

public class ArbitraryTypeObjectInstanceMethodReference {

	public static void main(String[] args) {

		String[] stringArray = { "Str1", "Str5", "Str2", "Str8", "Str4" };

		Arrays.sort(stringArray, String::compareToIgnoreCase);// method reference to arbitrary object of String type
		for (String s : stringArray) {
			System.out.println(s);
		}

	}

}
