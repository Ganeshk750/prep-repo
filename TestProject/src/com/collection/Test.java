package com.collection;

import java.util.List;

public class Test {

	public static void main(String[] args) {
       
		List<Employee> listOfEmployee = EmployeeList.employeeList();
		listOfEmployee.forEach(System.out::println);
		System.out.println("------------------- Initial Data ---------------");
	
	}

}
