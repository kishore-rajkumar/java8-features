## Stream

Stream API is another new feature of java 8. All the classes and interfaces of this API is in the **java.util.stream package**.

By using streams we can perform various **aggregate operations** on the data returned from **collections, arrays, Input/Output** operations. 

To understand how stream works, lets take an example without using stream and then we will see the same example with streams.


Prior to Java Stream
====================

Look at  
	
	java8.features.stream.PriorToStream.java


Post Stream
=========================

Look at  
	
	java8.features.stream.PostStream.java
	
	
	
**What is the difference between these codes?**

The output is same for both the examples; however there is a major difference in terms of performance.

In the first example, we are iterating the whole list to find the strings with length less than 6. **There is no parallelism** in the code.

In the second example, the stream() method returns a stream of all the names, the filter() method returns another stream of names with length less than 6, the count() method reduces this stream to the result. 

All these operations are happening parallelly which means we are able to parallelize the code with the help of streams. 

> **Parallel execution of operations using stream is faster than the sequential execution without stream**.



How to work with Stream
=======================

Working of stream can be explained in three stages:
 1. Create a stream
 2. Perform intermediate operations on the initial stream to transform it into another stream and so on on further intermediate operations.	In the above example, the **filter() operation is intermediate operation**, and there **can be more than one intermediate operations**.
 3. Perform terminal operation on the final stream to get the result.  In the above example, the **count() operation is the terminal operation**.
 
 
Stream Features
===============
 
 1. Stream does not store the elements. it simply performs the aggregate operations( such as filter() and count() ) to process the desired stream of data.
 
 2. The aggregate operations that we perform on the collection, array or any other data source **do not change the data of the source**, they simply **return a new stream**. For example the code we have seen above is filtering the strings with length less than 6 using the stream operations but it didn’t change the elements of the list.
 
 3. All the stream operations are lazy in nature which means they are not executed until they are needed. For example, if we want to display only the first 2 elements of a list using stream, the stream operation would stop at the end of second iteration after displaying the second element of list.
 
 
Examples
========

**1. Iterating and displaying selected integers** : <br/><br/>Look at  
	
	java8.features.stream.IteratingSelectedIntegers.java

**2. Concatenating two streams** : <br/><br/>Look at  
	
	java8.features.stream.ConcatenateStreams.java
	
**3. Stream allMatch()** : <br/><br/> Stream allMatch() method returns true if all the elements of stream satisfy the given predicate, else it returns false. Look at  
	
	java8.features.methodreference.StreamAllMatchExample.java
	
**4. Stream noneMatch()** : <br/><br/> The stream noneMatch() method works just opposite to the anyMatch() method, it returns true if none of the stream elements match the given predicate, it returns false if any of the stream elements matches the condition specified by the predicate. Look at
	
	java8.features.methodreference.StreamNoneMatchExample.java

**5. Stream anyMatch()** : <br/><br/> The stream nanyMatch() method returns true if any elements of the Stream matches the given predicate. Look at
	
	java8.features.methodreference.StreamAnyMatchExample.java
	