package com.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProblemEight {

	public static void main(String[] args) {
		
		//8. Get the details of youngest male employee in the product development department?

		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		
		Optional<Employee> result = list.stream()
		.filter(emp -> emp.getDepartment().equals("Product Development") && emp.getGender() == "Male")
		.min(Comparator.comparingInt(Employee::getAge));
		
		Employee emp = result.get();
		System.out.println("==================================");
        
		System.out.println("ID : "+emp.getId());
		         
		System.out.println("Name : "+emp.getName());
		         
		System.out.println("Age : "+emp.getAge());
		         
		System.out.println("Year Of Joinging : "+emp.getYearOfJoining());
        
		System.out.println("Salary : "+emp.getSalary());
		
	}

}
