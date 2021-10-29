package java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamNoneMatchExample {

	public static void main(String[] args) {

		Predicate<Student1> p1 = s -> s.getStuAge() < 20;
		Predicate<Student1> p2 = s -> s.getStuName().startsWith("T");

		List<Student1> students = Student1.getStudents();

		boolean r1 = students.stream().noneMatch(p1);
		System.out.println("students.stream().noneMatch(p1): " + r1);

		boolean r2 = students.stream().noneMatch(p2);
		System.out.println("students.stream().noneMatch(p2): " + r2);

	}

}

class Student1 {
	private int stuId;
	private int stuAge;
	private String stuName;

	public Student1(int stuId, int stuAge, String stuName) {
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

	public static List<Student1> getStudents() {

		List<Student1> list = new ArrayList<>();
		list.add(new Student1(11, 28, "Lucy"));
		list.add(new Student1(28, 27, "Tim"));
		list.add(new Student1(32, 30, "Daniel"));
		list.add(new Student1(49, 27, "Steve"));
		return list;

	}
}
