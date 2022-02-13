package com.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProblemFifteen {

	public static void main(String[] args) {

		//15. Who is the oldest employee in the organization? 
		// what is his age and which department he belongs to?
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		Optional<Employee> oldestEmployee = list.stream()
				.max(Comparator.comparingInt(Employee::getAge));
		
		Employee result = oldestEmployee.get();
		System.out.println("Name: "+ result.getName());
		System.out.println("Age: "+ result.getAge());
		System.out.println("Department he belogns to: "+ result.getDepartment());
		
	}

}
