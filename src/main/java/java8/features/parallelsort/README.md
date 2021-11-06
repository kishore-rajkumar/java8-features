## Arrays Parallel Sort

Java 8 introduced a new method **parallelSort() in the Arrays class** of **java.util** package. 

This method is introduced to support the parallel sorting of array elements.

**Algorithm of parallel sorting:**

1. The given array is divided into the sub arrays and the sub arrays are further divided into the their sub arrays, this happens until the sub array reaches a minimum granularity.

2. The sub arrays are sorted individually by multiple threads. The parallel sort uses Fork/Join Framework for sorting sub arrays parallely.

3. The sorted sub arrays are merged.

**Advantage of Parallel Sort Over Simple Sort:**

The parallelSort() method uses the concept of **multithreading** which makes it much faster compared to the normal sort **when there are lot of elements**.

 

Sorting Primitive Data types with Parallel Sort Example
========================================================
Here, we are concatenating multiple strings using StringJoiner. While creating the instance of StringJoiner, we have specified the delimiter as hyphen(-).
Look at  
	
	java8.features.parallelsort.PrimitiveDataTypeParallelSortExample.java


Parallel Sort by specifying the start and end index Example
===========================================================
We can also specify the start and end for the sorting, in this case the sub array starting from the start index and ending at the end index is sorted, the rest of the array is ignored and doesn’t get sorted.

Look at  
	
	java8.features.parallelsort.StartEndIndexParallelSortExample.java
	

Merging two StringJoiner objects Example
========================================

Here, notice that the prefix and suffix of the second StringJoiner object(str2) is discarded when merged. Only, the prefix and suffix of the first StringJoiner object(str1) are applicable.

Look at  
	
	java8.features.stringjoiner.StringJoinerMergingExample.java


Other Examples : setEmptyValue(), length() and toString() methods
=================================================================

Look at  
	
	java8.features.stringjoiner.OtherMethodsExample.java

