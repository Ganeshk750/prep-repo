package com.ganesh;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		
		List<Employee> emList = DbEmployee.listOfEmployee();
		emList.forEach(emp -> System.out.println(emp));
		System.out.println("====Initial List====");
		
        // Find Employee whose id == 6
	    //emList.stream().filter(e -> e.getId() == 6).forEach(System.out::println);
		//Stream<Employee> employeById = emList.stream().filter(e -> e.getId() == 2);
		//employeById.forEach(System.out::println);
		
		
		//System.out.println("====Employee With Multiple Conditions=====");
		// Find No of Employee name whose department is enng yearOfExp >= 2
		//List<Employee> resultWithMultipleCondition = emList.stream().filter(e -> e.getDepartment().equals("enng") || e.getYearOfExp() >= 2 ).collect(Collectors.toList());
		//resultWithMultipleCondition.forEach(System.out::println);
		
		
		//shorting employee based on yearof experience
		//List<Employee> sortedEmployee = emList.stream().sorted(Comparator.comparing(Employee::getYearOfExp)).collect(Collectors.toList());
		//sortedEmployee.forEach(System.out::println);
		
		
		
		
	}

}
