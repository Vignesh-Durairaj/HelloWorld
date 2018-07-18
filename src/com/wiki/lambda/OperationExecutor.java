package com.wiki.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.wiki.lambda.interfaces.IOperation;

public class OperationExecutor {
	
	IOperation<Integer, Integer> diagonalOperation = OperationFactory.getDiagonallengthImpl(); 
	IOperation<String, Integer> stringLengthOperation = OperationFactory.getStringLengthImpl();
	IOperation<String, Map<Character, Integer>> charCountOperation = OperationFactory.getCharCountImpl();
	IOperation<List<? extends Object>, Void> printListOperation = OperationFactory.getPrintObjectListImpl();
	
	public void execute (final Integer a, final String str) {
		System.out.println(
				"Diagonal value for a box with '" + a + 
				"' no of elements in total is : " + diagonalOperation.operate(a));
		
		System.out.println(
				"The length of the input String '" + str + 
				"' is : " + stringLengthOperation.operate(str));
		
		System.out.println("Printing the individual Char repitations !");
		
		Map<Character, Integer> charCountMap = charCountOperation.operate(str);
		if (null != charCountMap && !charCountMap.isEmpty()) {
			for(Entry<Character, Integer> entrySet : charCountMap.entrySet()) {
				System.out.println(
						"The count of character '" + entrySet.getKey() + 
						"' is : " + entrySet.getValue());
			}
		}
		
		List<Integer> intList = Arrays.asList(new Integer[] {10, 20, 0, 40, 50, 60, 70});
		printListOperation.operate(intList);
		printListOperation.operate(null);
	}
	
}
