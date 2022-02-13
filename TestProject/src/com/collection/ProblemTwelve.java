package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ProblemTwelve {

	public static void main(String[] args) {

		//12. List down the names of all employees in each department?
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		
		Map<String, List<Employee>> empMap = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
				
		Set<Entry<String, List<Employee>>> entrySetEmp = empMap.entrySet();
		for(Entry<String, List<Employee>> entry: entrySetEmp) {
			System.out.println("================");
			System.out.println("Employees In "+ entry.getKey());
			System.out.println("================");
			 List<Employee> empListName = entry.getValue();
       
			    for (Employee e : empListName) 
			    {
			        System.out.println(e.getName());
			    }
	   }
		  
	}
}
