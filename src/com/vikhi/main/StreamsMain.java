package com.vikhi.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.vikhi.stream.model.Employee;
import com.vikhi.stream.model.Person;
import com.vikhi.utils.EmployeeUtils;

public class StreamsMain {

	private static List<Employee> employeeList = EmployeeUtils.getEmployeeList();
	
	public static void main(String[] args) {
		getManagersList();
		mapVsFlatMap();
		mathOperations();
		matchoperations();
		findMax(false);
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
	
	public static void matchoperations() {
		System.out.println("Firing old Persons");
		List<Employee> oldEmpList = employeeList.stream()
												.filter(e -> e.getEmployeeDetails().getAge() >= 50)
												.map(EmployeeUtils::fireEmployee)
												.collect(Collectors.toList());
		List<Person> deadList = oldEmpList
									.stream()
									.filter(e -> e.getEmployeeDetails().getAge() < 60)
									.map(emp -> EmployeeUtils.killPerson(emp.getEmployeeDetails()))
									.collect(Collectors.toList());
		
		System.out.println("At least one Active : " + oldEmpList
														.stream()
														.anyMatch(e -> e.getEmployeeDetails().getIsAlive()));
		
		System.out.println("At least All Alive : " + deadList
														.stream()
														.allMatch(Person::getIsAlive));
		
		System.out.println("Are all old : " + oldEmpList
													.stream()
													.noneMatch(e -> e.getEmployeeDetails().getAge() < 50));
		
		System.out.println("Are all Active : " + deadList
													.stream()
													.noneMatch(Person::getIsAlive));
	}
	
	public static int findMax(boolean isFirstOccurrence) {
		int maxIndex = -1;
		
			List<Integer> intList = Arrays.asList(10, 2, 3, 4, 6, 0, 10);
			
			IntStream.range(0, intList.size())
			  .reduce((a,b)->(isFirstOccurrence ? intList.get(a)<intList.get(b) : intList.get(a)<=intList.get(b)) ? b: a)
			  .ifPresent(ix->System.out.println("Index "+ix+", value "+intList.get(ix)));
			
		
		return maxIndex;
	}
}