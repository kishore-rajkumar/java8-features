package java8.features.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAverageExample {

	public static void main(String[] args) {

		List<Student2> students = new ArrayList<Student2>();
		// Adding Student2s
		students.add(new Student2(11, "Jon", 22));
		students.add(new Student2(22, "Steve", 18));
		students.add(new Student2(33, "Lucy", 22));
		students.add(new Student2(44, "Sansa", 23));
		students.add(new Student2(55, "Maggie", 18));

		// Getting the average Age
		Double avgAge = students.stream().collect(Collectors.averagingInt(s -> s.age));

		System.out.println("Average age: " + avgAge);

	}

}

class Student2 {
	int id;
	String name;
	int age;

	public Student2(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}