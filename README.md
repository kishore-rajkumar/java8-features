# java8-features



## 1. Lambda Expression 

To create a lambda expression, we specify input parameters (if there are any) on the left side of the lambda operator ->, and place the expression or block of statements on the right side of lambda operator. For example, the lambda expression (x, y) -> x + y specifies that lambda expression takes two arguments x and y and returns the sum of these.


## 2. Method References

Method reference is a shorthand notation of a lambda expression to call a method. For example:
If your lambda expression is like this:

str -> System.out.println(str)

then you can replace it with a method reference like this:

System.out::println

The :: operator is used in method reference to separate the class or object from the method name.


## 3. Functional Interface

An interface with only single abstract method is called functional interface.

You can either use the predefined functional interface provided by Java or create your own functional interface and use it. 


## 4. Interface Changes – default method and static method


Prior to java 8, interface in java can only have abstract methods. All the methods of interfaces are public & abstract by default. 

Java 8 allows the interfaces to have default and static methods. 

The reason we have default methods in interfaces is to allow the developers to add new methods to the interfaces without affecting the classes that implements these interfaces.

