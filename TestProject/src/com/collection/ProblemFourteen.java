package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ProblemFourteen {

	public static void main(String[] args) {

		//14. Separate the employees who are younger 
		// or equal to 25 years from those employees
		// who are older then 25 years?
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		
		System.out.println("Employees younger than to 25 years :");
		List<String> greterThan25 = list.stream().filter(emp -> emp.getAge() > 25)
		             .map(Employee::getName).collect(Collectors.toList());
		greterThan25.forEach(System.out::println);
		            
		System.out.println("==================");
		System.out.println("Employees older than 25 years :");
		System.out.println("==================");
		List<String> olderThan25 = list.stream().filter(emp -> emp.getAge() < 25)
		             .map(Employee::getName).collect(Collectors.toList());
		olderThan25.forEach(System.out::println);
		
		System.out.println("***************2nd Methods*******************");
		
		Map<Boolean, List<Employee>> partitionEmployeesByAge=
				list.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		                
				Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();
				         
				for (Entry<Boolean, List<Employee>> entry : entrySet) 
				{
				    System.out.println("----------------------------");
				             
				    if (entry.getKey()) 
				    {
				        System.out.println("Employees older than 25 years :");
				    }
				    else
				    {
				        System.out.println("Employees younger than or equal to 25 years :");
				    }
				             
				    System.out.println("----------------------------");
				             
				    List<Employee> lists = entry.getValue();
				             
				    for (Employee e : lists) 
				    {
				        System.out.println(e.getName());
				    }
				}
		             
	}

}
