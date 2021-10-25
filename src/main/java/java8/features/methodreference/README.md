## Method References 

Method reference is a shorthand notation of a lambda expression to call a method. For example:
If your lambda expression is like this:

str -> System.out.println(str)

then you can replace it with a method reference like this:

System.out::println

The :: operator is used in method reference to separate the class or object from the method name(we will learn this with the help of examples).

Four types of method references
===================================

1. Method reference to an instance method of an object – object::instanceMethod
2. Method reference to a static method of a class – Class::staticMethod
3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
4. Method reference to a constructor – Class::new



Examples
========

**1. Method reference to an instance method of an object** : <br/><br/>Look at  
	
	java8.features.methodreference.ObjectInstanceMethodReference.java

**2. Method reference to an static method of a class** : <br/><br/>Look at  
	
	java8.features.methodreference.StaticMethodReference.java
	
**3. Method reference to an instance method of an arbitrary object of a particular type** : <br/><br/>Look at  
	
	java8.features.methodreference.ArbitraryTypeObjectInstanceMethodReference.java
	
**4. Method reference to a constructor** : <br/><br/>Look at  
	
	java8.features.methodreference.ConstructorMethodReference.java
	