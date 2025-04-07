package com.rishi.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class EmployeeRunner {
	
		static final String DRIVER = "com.mysql.cj.jdbc.Driver";
		static final String URL = "jdbc:mysql://localhost/example1?useSSL=false";
		static final String USER = "root";
		static final String PASS = "Rishi06";
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			EmployeeDaO empDao = new EmployeeDaO();
			
			try {
				Class.forName(DRIVER);
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			try (Connection conn = DriverManager.getConnection(URL, USER, PASS)){
				while(true) {
					System.out.println("==================================");
					System.out.println("||1. Insert Employee            ||");
					System.out.println("||2. Display All Employee       ||");
					System.out.println("||3. Update Employee            ||");
					System.out.println("||4. Delete Employee            ||");
					System.out.println("||5. Exit                       ||");
					System.out.println("==================================");
					
					System.out.print("Choice: ");
					int choice = in.nextInt();
					in.nextLine();
					switch(choice) {
					case 1:
						empDao.createNewEmployee(conn, in);
						break;
					case 2:
						empDao.displayEmployee(conn, in);
						break;
					case 3:
						empDao.updateEmployee(conn, in);
						break;
					case 4:
						empDao.deleteEmployee(conn, in);
						break;
					case 5:
						in.close();
						System.exit(0);
					default:
						System.out.println("-----Invalid choice-----");
					}
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


