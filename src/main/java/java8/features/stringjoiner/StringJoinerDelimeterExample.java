package java8.features.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDelimeterExample {

	public static void main(String[] args) {

		StringJoiner myString = new StringJoiner("-");
		
		// Joining multiple strings by using add() method
		myString.add("s1");
		myString.add("s2");
		myString.add("s3");
		myString.add("s4");

		System.out.println(myString);

	}

}
