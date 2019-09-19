package com.vikhi.stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.vikhi.stream.model.Employee;

public class StreamSupplier implements Supplier<Stream<Employee>> {

	private Object dataCollection;
	
	@SuppressWarnings("unchecked")
	@Override
	public Stream<Employee> get() {
		
		Stream<Employee> employeeStream;
		
		if (dataCollection instanceof List<?>) {
			employeeStream = StreamCreatorUtils.createStreamFromList((List<Employee>) dataCollection);
		} else if (dataCollection.getClass().isArray()) {
			employeeStream = StreamCreatorUtils.createStreamFromArray((Employee[]) dataCollection);
		} else {
			employeeStream = Stream.empty();
		}
		return employeeStream;
	}

	public void setDataCollection(Object dataCollection) {
		this.dataCollection = dataCollection;
	}

}
