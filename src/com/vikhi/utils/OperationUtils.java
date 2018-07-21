package com.vikhi.utils;

public final class OperationUtils {
	
	private OperationUtils() {
		// can be implemented if needed in future
	}

	public static int add (int a, int b) {
		return a + b;
	}
	
	public static  int sub (int a, int b) {
		return a - b;
	}
	
	public static  int max (int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static  int min (int a, int b) {
		return (a > b) ? b : a;
	}
	
	public static  int multiply (int a, int b) {
		return (a * b);
	}
	
	public static  int divide (int a, int b) {
		if (b != 0) {
			return a/b;
		} else { 
			return 0;
		}
	}
}
