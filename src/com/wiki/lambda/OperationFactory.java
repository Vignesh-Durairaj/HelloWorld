package com.wiki.lambda;

import java.util.HashMap;
import java.util.Map;

import com.wiki.lambda.interfaces.IOperation;

public class OperationFactory {
	
	private OperationFactory() throws Exception{
		throw new Exception ("This is a static util class and not in need of a constructor");
	}
	
	public static IOperation<Integer,  Integer> getDiagonallengthImpl() {
		return noOfElements -> {
			
			Integer diagonalLength = null;
			if (null != noOfElements) {
				Object temp = Math.sqrt(noOfElements);
				temp = Math.floor(Double.valueOf(temp.toString()));
				diagonalLength = ((Double) temp).intValue();
			} else {
				diagonalLength = 0;
			}
			
			return diagonalLength;
		};
	}
	
	public static IOperation<String, Integer> getStringLengthImpl() {
		return stringVal -> {
			Integer length = 0;
			
			if (null != stringVal && !stringVal.equals("")) {
				char[] inputArr = stringVal.toCharArray();
				length = inputArr.length;
			}
			
			return length;
		};
	}
	
	public static IOperation<String, Map<Character, Integer>> getCharCountImpl() {
		return inStr -> {
			Map<Character, Integer> countMap = null;
			
			if (inStr != null && !inStr.equals("")) {
				char[] charList = inStr.toCharArray();
				countMap = new HashMap< >();
				for (char c : charList) {
					Character character = Character.toLowerCase(c);
					Integer countVal = (null != countMap.get(character) ? (countMap.get(character) + 1) : 1);
					countMap.put(character, countVal);
				}
			}
			
			return countMap;
		};
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clonning is prohibitted !");
	}

}
