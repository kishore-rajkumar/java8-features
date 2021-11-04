package java8.features.optionalclass;

import java.util.Optional;

public class WithOptionalClass {

	public static void main(String[] args) {

		String str = null;

		Optional<String> isNUll = Optional.ofNullable(str);

		if (isNUll.isPresent()) {
			String subStr = str.substring(2);
			System.out.println(subStr);
		} else {
			System.out.println("Str is null!");
		}

		str = "This is a not null string!";

		Optional<String> isNUll2 = Optional.ofNullable(str);

		if (isNUll2.isPresent()) {
			String substr = str.substring(10);
			System.out.println("substr 3 of str: " + substr);
		}else {
			System.out.println("Str is again null!");
		}

	}

}
