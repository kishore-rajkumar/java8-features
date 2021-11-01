## forEach() Method

Java 8 introduced forEach method to iterate over collections and Streams in Java. In this guide, we will learn how to use forEach() and forEachOrdered() methods to loop a particular collection and stream.


forEach to iterate a Map
========================

Look at  
	
	java8.features.streamfilter.ForEachOverMap.java


forEach to iterate a List
=========================

Look at  
	
	java8.features.streamfilter.ForEachOverList.java
 
forEach method to iterate a Stream
==================================

Look at  
	
	java8.features.streamfilter.ForEachOverStream.java



Stream forEachOrdered() Method Example
======================================

For sequential streams the order of elements is same as the order in the source, so the output would be same whether you use forEach or forEachOrdered. 

However when working with parallel streams, you would always want to use the forEachOrdered() method when the order matters to you, as this method guarantees that the order of elements would be same as the source. 

Look at  
	
	java8.features.stream.ForEachOrderedExample.java