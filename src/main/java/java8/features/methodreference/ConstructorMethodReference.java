package java8.features.methodreference;

public class ConstructorMethodReference {

	public static void main(String[] args) {
		
		MyFunctionalInterface2 i = SomeClass::new;
		i.myInterfaceMethod();
		
	}

}

class SomeClass{
	SomeClass() {
		System.out.println("Constructor method reference display");
	}
}

@FunctionalInterface
interface MyFunctionalInterface2{
	void myInterfaceMethod();
}