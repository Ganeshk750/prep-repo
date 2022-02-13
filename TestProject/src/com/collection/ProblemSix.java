package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ProblemSix {

	public static void main(String[] args) {
		
		//6. Count the number of employees in each department?

		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		Map<String, Long> empCount = list.stream()
				                       .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		Set<Entry<String, Long>> empSet = empCount.entrySet();
		for(Entry<String, Long> entry : empSet) {
			 System.out.println(entry.getKey()+" :- "+entry.getValue());
		}
	}

}
