package com.collection;

import java.util.List;

public class ProblemTwo {

	public static void main(String[] args) {
		
		//2. Print the name of all departments in the organization?
		
		List<Employee> empList = EmployeeList.employeeList();
		System.out.println(empList);
		System.out.println("===============");
		
		empList.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);
	}

}
