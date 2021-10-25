package java8.features.functionalinterface;

public class OwnFunctionalInterfaceClass {

	public static void main(String[] args) {

		MyFuctionInterface i = (a, b) -> a + b;
		System.out.println("Result: " + i.addMethod(5, 10));
	}

}

interface MyFuctionInterface {
	int addMethod(int a, int b);
}
