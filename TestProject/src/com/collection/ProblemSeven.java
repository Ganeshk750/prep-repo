package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ProblemSeven {

	public static void main(String[] args) {

		//7. What is the average salary of each department?
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		Map<String, Double> avgSalDept = list.stream()
				  .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		Set<Entry<String, Double>> entrySetSal = avgSalDept.entrySet();
		for(Entry<String, Double> set: entrySetSal) {
			System.out.println(set.getKey() +" : "+ set.getValue());
		}
	}

}
