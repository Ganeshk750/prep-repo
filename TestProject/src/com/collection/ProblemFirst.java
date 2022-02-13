package com.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblemFirst {
	
	public static void main(String[] args) {
		
		// 1. How many male and female employees are there in the organization?
		
		List<Employee> employees = EmployeeList.employeeList();
		employees.forEach(System.out::println);
		System.out.println("========================");
		Map<String, Long> result = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(result);
		
		
		 
		
	}

}
