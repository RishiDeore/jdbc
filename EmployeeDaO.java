package com.rishi.employee;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class EmployeeDaO {
		public void createNewEmployee(Connection conn, Scanner sc) throws SQLException {
  		Employee employee = new Employee();                                           
    		employee.acceptData(sc);             
    		
    		String SQL = "insert into employee(empName,salary) values(?,?)";              
    		PreparedStatement pStatement = conn.prepareStatement(SQL);                    
    		pStatement.setString(1, employee.getName());                               
    		pStatement.setDouble(2, employee.getSalary());                                
    		int result = pStatement.executeUpdate();                                      
    		if (result == 1) {                                                            
    			System.out.println("Employee Record Created Successfully");                  
    		} else {                                                                      
    			System.out.println("Unable to create Employee Record");                      
    		}                                                                             
    		pStatement.close();                                                           
    	}
		
		public void displayEmployee(Connection conn, Scanner sc) throws SQLException {
	  		                                          
	    	    String SQL = "select*from employee"; 
	    	    Statement statement = conn.createStatement();
	    	    ResultSet resultSet=statement.executeQuery(SQL);
	    		PreparedStatement pStatement = conn.prepareStatement(SQL);                    
	    		while(resultSet.next()) {
	    			Employee employee=new Employee();
	    			employee.setId(resultSet.getInt("id"));
	    			employee.setName(resultSet.getString("name"));
	    			employee.setSalary(resultSet.getDouble("Salary"));
	    			System.out.println(employee);
	    		}
	    	}
		public void updateEmployee(Connection conn, Scanner sc) throws SQLException{
			System.out.println("Enter Employee ID:");
			int id= sc.nextInt();
			System.out.println("Enter salary");
			Double salary= sc.nextDouble();
			String SQL = "update employee set salary=? where empid=?";
			PreparedStatement pStatement = conn.prepareStatement(SQL);
			pStatement.setDouble(1, salary);
			pStatement.setDouble(2, id);
			int result=pStatement.executeUpdate();
			if(result==1) {
				System.out.println("Employee updated successfully");
			}else {
				System.out.println("Unable to update record");
			}
			pStatement.close();
	}
		public void deleteEmployee(Connection conn, Scanner sc) throws SQLException{
			System.out.println("Enter Employee ID for deletion");
			int id= sc.nextInt();
			System.out.println("Enter salary");
			Double salary= sc.nextDouble();
			String SQL = "delete from where empid=?";
			PreparedStatement pStatement = conn.prepareStatement(SQL);
			pStatement.setInt(1, id);
			
			int result=pStatement.executeUpdate();
			if(result==1) {
				System.out.println("Employee deleted successfully");
			}else {
				System.out.println("Unable to delete record");
			}
			pStatement.close();
	}
		
	
}
