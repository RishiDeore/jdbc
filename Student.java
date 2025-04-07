package collectionsbasics;

import java.util.*;


public class Student {
	
	
	protected int id;
	protected String name;
	protected String course;
	protected double marks;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	public Student(){
		
	}
	public Student(int id,String name, String course, double marks) {
		this.id=id;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(course, id, marks, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(course, other.course) && id == other.id
					&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
					&& Objects.equals(name, other.name);
		
	}
		public void acceptData() {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Id : ");
			id = in.nextInt();
			in.nextLine();
			System.out.println("Enter name : ");
			name = in.nextLine();
			System.out.println("Enter course : ");
			course = in.nextLine();
			System.out.println("Enter marks : ");
			marks = in.nextDouble();
		}
}
