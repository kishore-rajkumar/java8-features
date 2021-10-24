package java8.features.methodreference;

public class ObjectInstanceMethodReference {

	void display() {
		System.out.println("Displaying Object Instance Method reference");
	}

	public static void main(String[] args) {
		ObjectInstanceMethodReference obj = new ObjectInstanceMethodReference();
		MyInterface i = obj::display;
		i.myInterfaceMethod();
	}

}

@FunctionalInterface
interface MyInterface {
	void myInterfaceMethod();
}