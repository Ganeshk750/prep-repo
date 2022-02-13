package com.collection;

import java.util.List;

public class ProblemFive {

	public static void main(String[] args) {
      
		//5. Get the names of all employees who have joined after 2015? 
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		list.stream()
				.filter(emp -> emp.getYearOfJoining() > 2015)
				.map(Employee::getName)
				.forEach(System.out::println);
				
		
		
	}

}
