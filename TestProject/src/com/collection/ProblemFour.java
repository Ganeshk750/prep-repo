package com.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProblemFour {

	public static void main(String[] args) {
		
		//4. Get the details of highest paid employee in the organization?

		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
		
		System.out.println("Details Of Highest Paid Employee : ");
        Employee highestPaidEmployee = max.get();
		System.out.println("==================================");
		         
		System.out.println("ID : "+highestPaidEmployee.getId());
		         
		System.out.println("Name : "+highestPaidEmployee.getName());
		         
		System.out.println("Age : "+highestPaidEmployee.getAge());
		         
		System.out.println("Gender : "+highestPaidEmployee.getGender());
		         
		System.out.println("Department : "+highestPaidEmployee.getDepartment());
		         
		System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
		         
		System.out.println("Salary : "+highestPaidEmployee.getSalary());
		
		/****************************************************************/
		System.out.println("==================================");
		Optional<Employee> min = list.stream().min(Comparator.comparing(Employee::getSalary));
		
		System.out.println("Details Of Lowest Paid Employee : ");
        Employee lowestPaidEmployee = min.get();
		System.out.println("==================================");
		         
		System.out.println("ID : "+lowestPaidEmployee.getId());
		         
		System.out.println("Name : "+lowestPaidEmployee.getName());
		         
		System.out.println("Age : "+lowestPaidEmployee.getAge());
		         
		System.out.println("Gender : "+lowestPaidEmployee.getGender());
		         
		System.out.println("Department : "+lowestPaidEmployee.getDepartment());
		         
		System.out.println("Year Of Joining : "+lowestPaidEmployee.getYearOfJoining());
		         
		System.out.println("Salary : "+lowestPaidEmployee.getSalary());
		
		
	}

}
