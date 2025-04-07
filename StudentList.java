package collectionsbasics;

import java.util.*;

public class StudentList {

	protected ArrayList<Student> std;

	public StudentList() {
		std = new ArrayList<>();
	}

	public void addStudent() {
		Student obj = new Student();
		obj.acceptData();
		std.add(obj);
	}

	public void displayAllStudent() {
		std.forEach(System.out::println);
	}

	public void updateStudent(int id) {
		Student obj = new Student();
		obj.acceptData();
		for (int i = 0; i < std.size(); i++) {
			Student s = std.get(i);
			if (s.getId() == id) {

				s.setName(obj.getName());
				s.setCourse(obj.getCourse());
				s.setMarks(obj.getMarks());
				System.out.println("Student updated");
				return;
			}
		}
	}

	public void deleteStudent(int id) {
		for (int i = 0; i < std.size(); i++) {
			Student s = std.get(i);
			if (s.getId() == id) {
				std.remove(i);
				System.out.println("Student with ID" + id + "deleted");
			}
		}

	}

	public void sortByName() {
		std.sort(Comparator.comparing(Student::getName));
	}

	public void sortByCourseName() {
		std.sort(Comparator.comparing(Student::getCourse).thenComparing(Student::getName));
	}

	public void averageMarks() {
		double total = 0;
		int n = std.size();
		for (int i = 0; i < n; i++) {
			Student obj = std.get(i);
			total += obj.getMarks();
		}
		System.out.println("Average marks" + total / n);
	}

}
