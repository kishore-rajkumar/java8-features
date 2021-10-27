package java8.features.defaulltandstaticmethods;

public class MultipleInheritenceSolutionExample implements MyInterfaceA1, MyInterfaceB1 {

	public static void main(String[] args) {
		
		MultipleInheritenceSolutionExample o = new MultipleInheritenceSolutionExample();
		o.display();
		o.existingMetod();
		
		o.newMethod();

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

	// implementation of duplicate method here
	@Override
	public void newMethod() {
		System.out.println("New method implemented here");
	}


}

interface MyInterfaceA1 {
	default void newMethod() {
		System.out.println("MyInterfaceA: New Default method added!");
	}

	void display();
}

interface MyInterfaceB1 {
	void existingMetod();

	default void newMethod() {
		System.out.println("MyInterfaceB: New Default method added!");
	}
}