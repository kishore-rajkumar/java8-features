package java8.features.parallelsort;

import java.util.Arrays;

public class PrimitiveDataTypeParallelSortExample {

	public static void main(String[] args) {
		int numbers[] = { 22, 89, 1, 32, 19, 5 };

		System.out.print("Unsorted: ");

		// converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

		// Parallel Sort method for sorting int array
		Arrays.parallelSort(numbers);

		System.out.println();

		System.out.print("Parallel Sorted: ");
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

	}

}
