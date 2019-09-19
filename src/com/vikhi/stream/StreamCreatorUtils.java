package com.vikhi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.vikhi.stream.model.Employee;

public class StreamCreatorUtils {

	private StreamCreatorUtils () {
		// Can be implemented if needed.
	}
	
	public static Stream<Employee> createStreamFromList (final List<Employee> employeeList) {
		return (null != employeeList && !employeeList.isEmpty()) ? employeeList.stream() : Stream.empty();
	}
	
	public static Stream<Employee> createStreamFromArray (final Employee[] employeeArr) {
		return (null != employeeArr && employeeArr.length > 0) ? Arrays.stream(employeeArr) : Stream.empty();
	}
}
