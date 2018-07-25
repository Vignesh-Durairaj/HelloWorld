package com.vikhi.main;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vikhi.stream.model.Employee;
import com.vikhi.utils.EmployeeUtils;

public class StreamsMain {

	private static List<Employee> employeeList = EmployeeUtils.getEmployeeList();
	
	public static void main(String[] args) {
		getManagersList();
	}
	
	public static void printAllEmployees() {
		employeeList.stream()
					.forEach(EmployeeUtils::printEmployee);
	}
	
	public static void filterActiveEmployees() {
		employeeList.stream()
					.filter(EmployeeUtils::isEmployeeActive)
					.forEach(EmployeeUtils::printEmployee);
	}
	
	public static void filterSeniorPersons() {
		employeeList.stream()
					.filter(emp -> emp.getEmployeeDetails().getAge() > 35)
					.forEach(EmployeeUtils::printEmployee);
	}
	
	public static void getManagersList() {
		Map<Long, Employee> employeeMap = employeeList.stream()
					.collect(Collectors.toMap(Employee::getEmployeeId, p -> p));
		
		Collection<Employee> managerSet = employeeList
													.stream()
													.map(emp -> employeeMap.get(emp.getManagerId()))
													.collect(Collectors.toSet());
		
		managerSet
				.stream()
				.sorted((e1,e2) -> e1.getEmployeeId().compareTo(e2.getEmployeeId()))
				.forEach(System.out::println);
	}
}