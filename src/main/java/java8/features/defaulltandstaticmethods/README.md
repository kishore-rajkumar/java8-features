## Interface Changes – default method and static method

Prior to java 8, interface in java can only have abstract methods. All the methods of interfaces are public & abstract by default. 

Java 8 allows the interfaces to have default and static methods. 

The reason we have default methods in interfaces is to allow the developers to add new methods to the interfaces without affecting the classes that implements these interfaces.


Why default method?
===================

For example, if several classes such as A, B, C and D implements an interface XYZInterface then if we add a new method to the XYZInterface, we have to change the code in all the classes(A, B, C and D) that implements this interface.
In this example we have only four classes that implements the interface which we want to change but imagine if there are hundreds of classes implementing an interface then it would be almost impossible to change the code in all those classes.

This is why in java 8, we have a new concept “default methods”. 

These methods can be added to any existing interface and we do not need to implement these methods in the implementation classes mandatorily, thus we can add these default methods to existing interfaces without breaking the code. 

> We can say that concept of default method is introduced in java 8 to add the new methods in the existing interfaces in such a way so that they are backward compatible.
Backward compatibility is adding new features without breaking the old code.


**Static methods**

Static methods in interfaces are similar to the default methods except that we cannot override these methods in the classes that implements these interfaces.

Examples
========

**1. Default method in Interface** : <br/><br/>Look at  
	
	java8.features.defaulltandstaticmethods.DefaultMethodInterfaceExample.java

**2. Static method in Interface** : <br/><br/>Look at  
	
	java8.features.defaulltandstaticmethods.StaticMethodInterfaceExample.java
	
	
Java 8 – Abstract classes vs interfaces
=======================================

With the introduction of default methods in interfaces, it seems that the abstract classes are same as interface in java 8. However this is not entirely true, even though we can now have concrete methods(methods with body) in interfaces just like abstract class, this doesn’t mean that they are same. There are still few differences between them, one of them is that abstract class can have constructor while in interfaces we can’t have constructors.

The purpose of interface is to provide full abstraction, while the purpose of abstract class is to provide partial abstraction. This still holds true. 

The interface is like a blueprint for your class, with the introduction of default methods you can simply say that we can add additional features in the interfaces without affecting the end user classes.

Default Method and Multiple Inheritance
=======================================

The multiple inheritance problem can occur, when we have two interfaces with the default methods of same signature. 

See -   
	
	java8.features.defaulltandstaticmethods.MultipleInheritenceProblemExample.java
	
	output: 
		Compilation error - Duplicate default methods named newMethod with the parameters () and () are inherited from the types MyInterfaceB and MyInterfaceA
				
This is because we have the same method in both the interface and the compiler is not sure which method to be invoked.


##### How to solve this issue?

The implementing class has to mandatorily implement the common default method of the two interfaces.

See -   
	
	java8.features.defaulltandstaticmethods.MultipleInheritenceSolutionExample.java

