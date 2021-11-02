## StringJoiner

In java 8, a new class StringJoiner is introduced in the java.util package.

Using this class we can join more than one strings with the specified delimiter, we can also provide prefix and suffix to the final string while joining multiple strings. 

Joining strings by specifying delimiter Example
================================================
Here, we are concatenating multiple strings using StringJoiner. While creating the instance of StringJoiner, we have specified the delimiter as hyphen(-).
Look at  
	
	java8.features.stringjoiner.StringJoinerDelimeterExample.java


Adding prefix and suffix to the output String Example
=====================================================

Look at  
	
	java8.features.stringjoiner.StringJoinerPrefixSuffixExample.java
	

Merging two StringJoiner objects Example
========================================

Here, notice that the prefix and suffix of the second StringJoiner object(str2) is discarded when merged. Only, the prefix and suffix of the first StringJoiner object(str1) are applicable.

Look at  
	
	java8.features.stringjoiner.StringJoinerMergingExample.java


Other Examples : setEmptyValue(), length() and toString() methods
=================================================================

Look at  
	
	java8.features.stringjoiner.OtherMethodsExample.java

