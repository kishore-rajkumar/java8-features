package java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamAnyMatchExample {

	public static void main(String[] args) {
		Predicate<Student2> p = s -> s.getStuName().startsWith("L");

		List<Student2> students = Student2.getStudents();

		boolean r = students.stream().anyMatch(p);

		System.out.println("students.stream().anyMatch(p): " + r);

	}

}

class Student2 {
	private int stuId;
	private int stuAge;
	private String stuName;

	public Student2(int stuId, int stuAge, String stuName) {
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

	public static List<Student2> getStudents() {

		List<Student2> list = new ArrayList<>();
		list.add(new Student2(11, 28, "Lucy"));
		list.add(new Student2(28, 27, "Tim"));
		list.add(new Student2(32, 30, "Daniel"));
		list.add(new Student2(49, 27, "Steve"));
		return list;

	}
}
