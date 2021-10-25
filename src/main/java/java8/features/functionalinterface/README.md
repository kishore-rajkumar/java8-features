## Functional Interface

An interface with only single abstract method is called functional interface.<br/>
You can either use the predefined functional interface provided by Java or create your own functional interface and use it. 

**Java predefined functional interfaces** are here - <a href="https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">[Link]</a><br/>
They all have only one abstract method. That is the reason, they are also known as Single Abstract Method interfaces (SAM Interfaces).

To use lambda expression in Java, you need to either create your own functional interface or use the pre defined functional interface provided by Java. While creating your own functional interface, mark it with @FunctionalInterface annotation, this annotation is introduced in Java 8. Although its optional, you should use it so that you get a compilation error if the interface you marked with this annotation is not following the rules of functional interfaces.

Rules of defining a functional interface
========================================

The functional interface should have **Only one** abstract method. Along with the one abstract method, they can have any number of default and static methods.



Examples
========

**1. Creating your own functional interface** : <br/><br/>Look at  
	
	java8.features.functionalinterface.OwnFunctionalInterfaceClass.java

**2. Using predefined functional interface** : <br/><br/>Look at  
	
	java8.features.methodreference.UsingPredefinedFunctionalInterfaceClass.java
	
Functional Interface: Using anonymous inner class vs using lambda expression
============================================================================

We have been using functional interfaces even prior to java8, they were used by creating anonymous inner classes using these interfaces.
You must have seen functional interfaces such as Runnable, ActionListener, Comparator etc. They all have single abstract method.

1. **ActionListener Example: Before Java 8: Using anonymous inner class** - Check here - <a href="https://github.com/kishore-rajkumar/java8-features/blob/main/src/main/java/java8/features/lambda/PriorJava8ButtonListener.java">[Link]</a>
2. **ActionListener Example: After Java 8:  Lambda Expression** - Check here - <a href="https://github.com/kishore-rajkumar/java8-features/blob/main/src/main/java/java8/features/lambda/PostJava8ButtonListener.java">[Link]</a>





