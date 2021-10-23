package java8.features.lambda;

public class LambdaExampleWithParameters {

	public static void main(String[] args) {

		// lambda with no parameter
		MyFunctionalInterface1 i = () -> {
			System.out.println("Hello! lambda with no parameers");
		};
		i.sayHello();

		// lambda with 1 parameter
		MyFunctionalInterface2 i2 = (name) -> {
			System.out.println("Hello " + name + "! lambda with 1 parameter");
		};
		i2.sayHello("Kishore");

		// lambda with multiple parameters
		MyFunctionalInterface3 i3 = (fname, lname) -> {
			String name = fname.concat(" ").concat(lname);
			System.out.println("Hello " + name + "! lambda with multiple parameters");
		};
		i3.sayHello("Kishore", "Rajkumar");

	}

}

interface MyFunctionalInterface1 {
	void sayHello();
}

interface MyFunctionalInterface2 {
	void sayHello(String name);
}

interface MyFunctionalInterface3 {
	void sayHello(String fnanme, String lname);
}
