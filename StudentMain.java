package collectionsbasics;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {

		StudentList list = new StudentList();
		while (true) {
			System.out.println(". Add a Student to the list. \r\n" + "2. Display all Students in the list. \r\n"
					+ "3. Update a Student's marks (by ID). \r\n" + "4. Delete a Student (by ID). \r\n"
					+ "5. Sort Students by name in ascending order. \r\n"
					+ "6. Sort Students by course and name in ascending order. \r\n"
					+ "7. Calculate the average marks of all students. \r\n" + "8. Exit the program. \r\n" + "");

			System.out.println("\nEnter your choice : ");
			int a;

			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			switch (a) {
			case 1: {
				list.addStudent();
				break;
			}
			case 2: {
				list.displayAllStudent();
				break;
			}
			case 3: {
				System.out.println("Enter the ID : ");
				int id = obj.nextInt();
				list.updateStudent(id);
				break;
			}
			case 4: {
				System.out.println("Enter the ID : ");
				int id = obj.nextInt();
				list.deleteStudent(id);
				break;
			}
			case 5: {
				list.sortByName();
				break;
			}
			case 6: {
				list.sortByCourseName();
				break;
			}
			case 7: {
				list.averageMarks();
				break;
			}
			case 8: {
				obj.close();
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + a);
			}
		}
	}
}
