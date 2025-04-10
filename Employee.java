package com.rishi.employee;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	protected int id;
	protected String name;
	protected double salary;

	public Employee() {

	}

	public Employee(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}

	public void acceptData(Scanner in) {
		System.out.println("Enter the id");
		id = in.nextInt();
		System.out.println("Enter the name");
		name = in.nextLine();
		System.out.println("Enter the salary");
		salary = in.nextDouble();
	}
}
