package java8.features.methodreference;

public class StaticMethodReference {

	public static void main(String[] args) {

		MyInterface1 i = Utility::util;
		i.someStaticUtil();

	}

}

@FunctionalInterface
interface MyInterface1 {
	void someStaticUtil();
}

class Utility {
	static void util() {
		System.out.println("static method reference");
	}
	
	static void anotherUtil() {
		System.out.println("another static method");
	}
}
