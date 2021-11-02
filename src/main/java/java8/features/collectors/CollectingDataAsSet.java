package java8.features.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingDataAsSet {

	public static void main(String[] args) {

		List<Student1> students = new ArrayList<Student1>();
		students.add(new Student1(11, "Jon", 22));
		students.add(new Student1(22, "Steve", 18));
		students.add(new Student1(33, "Lucy", 22));
		students.add(new Student1(44, "Sansa", 23));
		students.add(new Student1(55, "Maggie", 18));

		Set<String> nameSet = students.stream().map(s -> s.name).collect(Collectors.toSet());

		nameSet.forEach(System.out::println);

	}

}

class Student1 {
	int id;
	String name;
	int age;

	public Student1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
