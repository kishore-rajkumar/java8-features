package java8.features.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDataAsList {

	public static void main(String[] args) {

		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student(11, "Jon", 22));
		studentlist.add(new Student(22, "Steve", 18));
		studentlist.add(new Student(33, "Lucy", 22));
		studentlist.add(new Student(44, "Sansa", 23));
		studentlist.add(new Student(55, "Maggie", 18));

		List<String> names = studentlist.stream().map(s -> s.name).collect(Collectors.toList());

		names.forEach(System.out::println);

	}

}

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
