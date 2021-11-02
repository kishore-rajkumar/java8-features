package java8.features.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerMergingExample {

	public static void main(String[] args) {

		StringJoiner str1 = new StringJoiner("->", "{", "}");
		str1.add("s1");
		str1.add("s2");
		str1.add("s3");
		str1.add("s4");

		System.out.println(str1);

		StringJoiner str2 = new StringJoiner("#", "pre", "suff");
		str2.add("d1");
		str2.add("d2");
		str2.add("d3");
		str2.add("d4");

		System.out.println(str2);

		StringJoiner newStr = str1.merge(str2);
		System.out.println(newStr.toString());

	}

}
