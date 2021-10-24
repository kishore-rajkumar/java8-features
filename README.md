# java8-features

Java 8 new features to be learned and added

## 1. Lambda Expression 

To create a lambda expression, we specify input parameters (if there are any) on the left side of the lambda operator ->, and place the expression or block of statements on the right side of lambda operator. For example, the lambda expression (x, y) -> x + y specifies that lambda expression takes two arguments x and y and returns the sum of these.


## 2. Method References

Method reference is a shorthand notation of a lambda expression to call a method. For example:
If your lambda expression is like this:

str -> System.out.println(str)

then you can replace it with a method reference like this:

System.out::println

The :: operator is used in method reference to separate the class or object from the method name.