package com.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblemTen {

	public static void main(String[] args) {
      
		//10. How many male and female employees are there in the sales and marketing team?
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		Map<String, Long> countEmp = list.stream()
				.filter(emp -> emp.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(countEmp);
	}

}
