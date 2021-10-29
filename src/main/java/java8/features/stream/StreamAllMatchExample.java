package java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * We have three predicates in this example,
 * - predicate p1 says that the student name starts with “A”,
 * - predicate p2 says that the student age is less than 40,
 * - predicate p3 says that the age must be less than 40 and name should start with “P”.
 * 
 * allMatch() method returns false for predicate p1 because there are students whose names do not start with “A”.
 * allMatch() method returns true for predicate p2 because all students have age less than 40.
 * allMatch() method returns false for predicate p3 because details of all the students do not statisfy the condition of age <40 and name start with “P”.
 */

public class StreamAllMatchExample {

	public static void main(String[] args) {
		Predicate<Student> p1 = s -> s.getStuName().startsWith("A");
		Predicate<Student> p2 = s -> s.getStuAge() < 40;
		Predicate<Student> p3 = s -> s.getStuAge() < 40 && s.getStuName().startsWith("P");

		List<Student> students = Student.getStudents();

		/*
		 * allMatch() method returns true if all the elements of stream satisfy the
		 * given predicate, else it returns false
		 */

		boolean r1 = students.stream().allMatch(p1);
		System.out.println("students.stream().allMatch(p1): " + r1);

		boolean r2 = students.stream().allMatch(p2);
		System.out.println("students.stream().allMatch(p2): " + r2);

		boolean r3 = students.stream().allMatch(p3);
		System.out.println("students.stream().allMatch(p3): " + r3);

	}

}

class Student {
	private int stuId;
	private int stuAge;
	private String stuName;

	public Student(int stuId, int stuAge, String stuName) {
		super();
		this.stuId = stuId;
		this.stuAge = stuAge;
		this.stuName = stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public int getStuAge() {
		return stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public static List<Student> getStudents() {

		List<Student> list = new ArrayList<>();
		list.add(new Student(11, 28, "Lucy"));
		list.add(new Student(28, 27, "Tim"));
		list.add(new Student(32, 30, "Daniel"));
		list.add(new Student(49, 27, "Steve"));
		return list;

	}

}
