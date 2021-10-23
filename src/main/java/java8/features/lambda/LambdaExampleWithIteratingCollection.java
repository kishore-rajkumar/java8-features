package java8.features.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExampleWithIteratingCollection {

	public static void main(String[] args) {
		// lambda iterate list
		LambdaIterateList lambdaList = new LambdaIterateList();
		lambdaList.iterateList();
		
		System.out.println();

		// lambda iterate map
		LambdaIterateMap lambdaMap = new LambdaIterateMap();
		lambdaMap.iterateMap();
		
	}

}

class LambdaIterateMap {

	void iterateMap() {
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Mango", 30);
		prices.put("Orange", 70);
		prices.put("Grapes", 60);

		prices.forEach((k, v) -> {
			System.out.println("Fruit: " + k + " -> price is " + v);
		});
	}
}

class LambdaIterateList {

	void iterateList() {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Harry");
		names.add("Mary");
		names.add("Shaun");
		names.add("Lisa");

		names.forEach(name -> {
			System.out.println(name);
		});
	}
}
