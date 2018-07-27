package com.vikhi.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vikhi.stream.model.Employee;
import com.vikhi.utils.EmployeeUtils;

public class StreamsMain {

	private static List<Employee> employeeList = EmployeeUtils.getEmployeeList();
	
	public static void main(String[] args) {
		getManagersList();
		mapVsFlatMap();
		mathOperations();
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
		Map<Long, Employee> employeeMap = employeeList
													.stream()
													.collect(Collectors.toMap(Employee::getEmployeeId, p -> p));
		
		Collection<Employee> managerSet = employeeList
													.stream()
													.map(emp -> employeeMap.get(emp.getManagerId()))
													.collect(Collectors.toSet());
		
		managerSet
				.stream()
				.sorted(Comparator.comparing(Employee::getEmployeeId))
				.forEach(System.out::println);
	}
	
	public static void mapVsFlatMap() {
		employeeList.stream()
					.map(emp -> Arrays.stream(emp.getEmployeeDetails().getLastName().split(" ")))
					.collect(Collectors.toList())
					.forEach(System.out::println);
		
		employeeList.stream()
					.flatMap(emp -> Arrays.stream(emp.getEmployeeDetails().getLastName().split(" ")))
					.collect(Collectors.toList())
					.forEach(System.out::println);
	}
	
	public static void mathOperations() {
		employeeList.stream()
					.max(Comparator.comparingInt(emp -> emp.getEmployeeDetails().getAge()))
					.ifPresent(System.out::println);
		
		employeeList.stream()
					.min(Comparator.comparing(Employee::getEmployeeId))
					.ifPresent(System.out::println);
	}
}