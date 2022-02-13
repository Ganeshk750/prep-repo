package com.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblemEleven {

	public static void main(String[] args) {
        
		//11. What is the average salary of male and female employees? 
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		Map<String, Double> mapAgeAvg = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(mapAgeAvg);
	}

}
