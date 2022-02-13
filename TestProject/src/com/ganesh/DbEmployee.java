package com.ganesh;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DbEmployee {
	
	public static List<Employee> listOfEmployee(){
		return Stream.of(new Employee(1, "Ganesh","Enng", 35000.00, 3),
				new Employee(3, "Chandan","Business", 30000.00, 1),
				new Employee(2, "Sahashi","Enng", 25000.00, 2),
				new Employee(5, "Arnav","Enng", 20000.00, 1),
				new Employee(6, "Manish","R&D", 45000.00, 5),
				new Employee(8, "Santosh","SeniorEnng", 55000.00, 8),
				new Employee(4, "Pallavi","HR", 25000.00, 2)).collect(Collectors.toList());
	}

}
