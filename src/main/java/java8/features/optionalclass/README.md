## Optional Class

Optional class was newly introduced in java 8 inside **java.util** package.

This class is introduced **to avoid NullPointerException** that we frequently encounters if we do not perform null checks in our code. 

Using this class we can easily check whether a variable has null value or not and by doing this we can avoid the NullPointerException.

Before we see the example of Optional class, lets see what happens when we don’t use Optional class and do not perform null check.



Without using Optional class
============================
In this example, we didn’t assign the value to the String str and trying to get the substring out of it. Since there is no value present in the str, the program is throwing NullPointerException.


Look at  
	
	java8.features.optionalclass.WithoutOptionalClass.java


Using Optional Class: Solution
==============================

Optional.ofNullable() method of the Optional class, returns a Non-empty Optional if the given object has a value, otherwise it returns an empty Optional.

We can check whether the returned Optional value is empty or non-empty using the isPresent() method.

Look at  
	
	java8.features.optionalclass.WithOptionalClass.java
	

Optional isPresent() vs ifPresent() methods
===========================================

Using **isPresent()** method we can check whether the particular Optional object(or instance) is empty or no-empty.

There is another method present in the Optional class, which only executes if the given Optional object is non-empty, the method is **ifPresent()**. 



Look at  
	
	java8.features.optionalclass.IfPresentAndIsPresentMethods.java


Optional orElse() and orElseGet() methods
=========================================

These two methods orElse() and orElseGet() returns the value of Optional Object if it is not empty, if the object is empty then it returns the default value passed to this method as an argument.

Look at  
	
	java8.features.optionalclass.OrElseAndOrElseGetExample.java
	
Optional.map and Optional.flatMap
=================================

Look at  
	
	java8.features.optionalclass.OptionalMapAndOptionalFlatMapExample.java
