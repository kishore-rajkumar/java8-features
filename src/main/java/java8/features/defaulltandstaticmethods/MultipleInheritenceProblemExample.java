package java8.features.defaulltandstaticmethods;

public class MultipleInheritenceProblemExample implements MyInterfaceA, MyInterfaceB {

	public static void main(String[] args) {
		
		MultipleInheritenceProblemExample o = new MultipleInheritenceProblemExample();
		o.display();
		o.existingMetod();

	}

	// regular abstract method overridden
	@Override
	public void existingMetod() {
		// TODO Auto-generated method stub
		
	}

	// regular abstract method overridden
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}


}

interface MyInterfaceA {
	default void newMethod() {
		System.out.println("MyInterfaceA: New Default method added!");
	}

	void display();
}

interface MyInterfaceB {
	void existingMetod();

	default void newMethod() {
		System.out.println("MyInterfaceB: New Default method added!");
	}
}
