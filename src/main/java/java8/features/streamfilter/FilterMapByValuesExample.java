package java8.features.streamfilter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapByValuesExample {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(11, "Apple");
		hmap.put(22, "Orange");
		hmap.put(33, "Kiwi");
		hmap.put(44, "Banana");

		Map<Integer, String> result = hmap.entrySet().stream().filter(map -> map.getValue().length() < 6)
				.collect(Collectors.toMap(m -> m.getKey(), m -> m.getValue()));

		System.out.println(result);

	}

}
