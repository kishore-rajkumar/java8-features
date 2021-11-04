package java8.features.optionalclass;

public class WithoutOptionalClass {

	public static void main(String[] args) {

		String str = null;

		String subStr = str.substring(2); // str is null and will throw a NullPointerException here

		System.out.println(subStr);

	}

}
