package com.collection;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemThirteen {

	public static void main(String[] args) {

		//13. What is the average salary and total salary of the whole organization?
		
		List<Employee> list = EmployeeList.employeeList();
		list.forEach(System.out::println);
		System.out.println("=================");
		
		
		        DoubleSummaryStatistics employeeSalaryStatistics = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
				         
				System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
				         
				System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
	}

}
