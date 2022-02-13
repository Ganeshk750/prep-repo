package com.ganesh;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private double salary;
	private int yearOfExp;
	
	public Employee() {
	}
	
	public Employee(int id, String name, String department, double salary, int yearOfExp) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.yearOfExp = yearOfExp;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYearOfExp() {
		return yearOfExp;
	}
	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", yearOfExp=" + yearOfExp + "]";
	}
	
	
	

}
