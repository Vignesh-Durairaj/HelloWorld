package com.vikhi.collection;

import java.nio.CharBuffer;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExercise {

	public static void main(String[] args) {
		Map<Integer, Integer> myMap  = 
				IntStream
					.rangeClosed(1, 20)
					.mapToObj(num -> new AbstractMap.SimpleEntry<Integer, Integer>(Integer.valueOf(num), 1))
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(myMap);
		
		List<Integer> intList = Arrays.asList(new Integer[]{12, 23, 45, 20, 55, 1});
		intList
			.stream()
			.forEach(ele -> myMap.merge(ele, 1, (v1, v2) -> v1 + 1));
		
		System.out.println(myMap);
		
		getCharacterCount("This is sparta");
	}
	
	private static void getCharacterCount(final String str) {
		if (str == null || str.trim().length() == 0) {
			throw new IllegalArgumentException("The input string should not be empty or null");
		}
		
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		CharBuffer
			.wrap(str.replace(" ", "").toLowerCase().toCharArray())
			.chars()
			.mapToObj(charInt -> (char)charInt)
			.forEach(ch -> charCountMap.merge(ch, 1, (v1, v2) -> v1 + 1));
		
		System.out.println(charCountMap);
	}
}
