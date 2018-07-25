package com.vikhi.utils;

import java.util.ArrayList;
import java.util.List;

import com.vikhi.stream.model.Employee;
import com.vikhi.stream.model.Person;

public class EmployeeUtils {

	private EmployeeUtils() {
		// Can be implemented in future, if needed.
	}
	
	public static Person copyPerson (final Person anotherPerson) {
		Person newPerson = null;
		if (anotherPerson != null) {
			newPerson = new Person (anotherPerson.getFirstName(), anotherPerson.getLastName(), 
					anotherPerson.getAge(), anotherPerson.getCity(), anotherPerson.getIsAlive());
		}
		
		return newPerson;
	}
	
	public static Person killPerson (final Person person) {
		person.setIsAlive(Boolean.FALSE);
		return person;
	}
	
	public static Employee fireEmployee(final Employee employee) {
		employee.setIsActive(Boolean.FALSE);
		return employee;
	}
	
	public static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<>(0);
		employeeList.add(new Employee(1L, getPersonJohn(), 3L, Boolean.TRUE));
		employeeList.add(new Employee(2L, getPersonVikhi(), 7L, Boolean.TRUE));
		employeeList.add(new Employee(3L, getPersonPete(), 7L, Boolean.TRUE));
		employeeList.add(new Employee(4L, getPersonKevin(), 5L, Boolean.TRUE));
		employeeList.add(new Employee(5L, getPersonCheung(), 3L, Boolean.TRUE));
		employeeList.add(new Employee(6L, getPersonReddy(), 7L, Boolean.TRUE));
		employeeList.add(new Employee(7L, getPersonTom(), 7L, Boolean.TRUE));
		return employeeList;
	}
	
	private static Person getPersonJohn() {
		return new Person("Johny", "Smithson", 35, "Bentonville", Boolean.TRUE);
	}
	
	private static Person getPersonVikhi() {
		return new Person("Vignesh", "Durairaj", 31, "Chennai", Boolean.TRUE);
	}
	
	private static Person getPersonPete() {
		return new Person("Peter", "Lialios", 46, "Tampa", Boolean.TRUE);
	}
	
	private static Person getPersonKevin() {
		return new Person("Kevin", "Tsz Kin Chan", 33, "Hong Kong", Boolean.TRUE);
	}
	
	private static Person getPersonCheung() {
		return new Person("Cheung", "Tsang", 43, "Shangai", Boolean.TRUE);
	}
	
	private static Person getPersonReddy() {
		return new Person("Samarasimha", "Reddy", 53, "San Fransisco", Boolean.TRUE);
	}
	
	private static Person getPersonTom() {
		return new Person("Thomas", "Brunning", 63, "Aberystwyth", Boolean.TRUE);
	}
	
}
