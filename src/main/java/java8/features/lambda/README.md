## 1. Lambda Expression 

To create a lambda expression, we specify input parameters (if there are any) on the left side of the lambda operator ->, and place the expression or block of statements on the right side of lambda operator. For example, the lambda expression (x, y) -> x + y specifies that lambda expression takes two arguments x and y and returns the sum of these.

Lambda expression vs method in Java
===================================

A method (or function) in Java has these main parts:
1. Name
2. Parameter list
3. Body
4. return type.

A lambda expression in Java has these main parts:
Lambda expression only has **body** and **parameter list**.
1. **No** name – function is anonymous so we don’t care about the name
2. Parameter list
3. Body – This is the main part of the function.
4. **No** return type – The java 8 compiler is able to infer the return type by checking the code. you need not to mention it explicitly.

Where to use the Lambdas in Java
=================================

To use lambda expression, you need to either create your own functional interface or use the pre defined functional interface provided by Java. An interface with only single abstract method is called functional interface(or Single Abstract method interface), for example: Runnable, callable, ActionListener etc.

**To use function interface:**

Pre Java 8: We create anonymous inner classes.<br/>
Post Java 8: You can use lambda expression instead of anonymous inner classes.


**Pre & Post java 8 examples**

1) Pre java8 : Look at java8.features.lambda.**PriorJava8ButtonListener.java**<br/>
2) Post java8 : Look at java8.features.lambda.**PriorJava8ButtonListener.java**


 
