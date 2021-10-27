package java8.features.defaulltandstaticmethods;

public class DefaultMethodInterfaceExample implements MyInterface {

	public static void main(String[] args) {

		MyInterface i = new DefaultMethodInterfaceExample();
		i.existingMethod();

		// default method called directly from the interface
		i.defaultMethod();

	}

	@Override
	public void existingMethod() {
		System.out.println("existingMethod: Regular abstract method called!");
	}

}

interface MyInterface {

	// regular abstract method
	void existingMethod();

	// java 8; default method; implementing class need not mandatorily implement it
	default void defaultMethod() {
		System.out.println("defaultMethod: Default method called!");
	}

}