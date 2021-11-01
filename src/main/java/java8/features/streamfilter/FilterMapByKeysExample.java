package java8.features.streamfilter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapByKeysExample {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(11, "Apple");
		hmap.put(22, "Orange");
		hmap.put(33, "Kiwi");
		hmap.put(44, "Banana");

		Map<Integer, String> newMap = hmap.entrySet().stream().filter(map -> map.getKey() < 22)
				.collect(Collectors.toMap(map1 -> map1.getKey(), map1 -> map1.getValue()));

		System.out.println(newMap);

	}

}
