package com.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblemThree {

	public static void main(String[] args) {

		//3. What is the average age of male and female employee?
		
		List<Employee> list = EmployeeList.employeeList();
		System.out.println(list);
		System.out.println("=================");
		
		Map<String, Double> avgAgeOfEmp = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeOfEmp);
		
		
	}

}
