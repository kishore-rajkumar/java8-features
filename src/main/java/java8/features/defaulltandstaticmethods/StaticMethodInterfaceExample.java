package java8.features.defaulltandstaticmethods;

public class StaticMethodInterfaceExample implements MyInterfaceWithStaticMethod{

	public static void main(String[] args) {
		
		MyInterfaceWithStaticMethod i =  new StaticMethodInterfaceExample();
		
		// calling regular implemented method
		i.existingMethod();
		
		// method called directly from the interface
		MyInterfaceWithStaticMethod.staticMethod();

	}

	@Override
	public void existingMethod() {
		System.out.println("existingMethod: Regular abstract method called!");
	}

}

interface MyInterfaceWithStaticMethod {

	// regular abstract method
	void existingMethod();

	/*
	 * No implementation is needed; Infact static methods cannot be overriden by the
	 * implementing classes
	 */
	static void staticMethod() {
		System.out.println("staticMethod: Static method called directly from interface!");
	}

}
