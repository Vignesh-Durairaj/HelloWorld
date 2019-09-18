package com.vikhi.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListExercise {

	public List<Object> getListFromArray(final Object[] objArr) {
		return IntStream
				.range(0, objArr.length)
				.mapToObj(idx -> objArr[idx])
				.collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		ListExercise le = new ListExercise();
		Integer[] intArr = {12, 223, 53, 632, 1};
		List<Object> intList = le.getListFromArray(intArr);
		intList.forEach(System.out::println);
		
		le.getOrdinaryCollection().add(1);
		System.out.println("Ordinary collection created");
		le.getFactoryCollection().add(1);
		System.out.println("Factory collection created");
	}
	
	public Collection<Object> getFactoryCollection() {
		return Set.of();
	}
	
	public Collection<Object> getOrdinaryCollection() {
		return new HashSet<Object>();
	}
}
