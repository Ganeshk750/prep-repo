package com.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProblemNine {

	public static void main(String[] args) {

		//9. Who has the most working experience in the organization?
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		
		//list.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		Optional<Employee> exp = list.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
		
		Employee emp = exp.get();
		System.out.println("==================================");
        
		System.out.println("ID : "+emp.getId());
		         
		System.out.println("Name : "+emp.getName());
		         
		System.out.println("Age : "+emp.getAge());
		
		System.out.println("Gender : "+emp.getGender());
		
		System.out.println("Department : "+emp.getDepartment());
		         
		System.out.println("Year Of Joinging : "+emp.getYearOfJoining());
        
		System.out.println("Salary : "+emp.getSalary());
	}

}
