package com.vikhi.main;

import java.util.List;

import com.vikhi.stream.model.Employee;
import com.vikhi.utils.EmployeeUtils;

public class StreamsMain {

	public static void main(String[] args) {
		printAllEmployees();
	}
	
	public static void printAllEmployees() {
		List<Employee> employeeList = EmployeeUtils.getEmployeeList();
		employeeList.stream()
					.forEach(System.out::println);
	}
}