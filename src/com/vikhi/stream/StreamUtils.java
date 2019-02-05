package com.vikhi.stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamUtils {

	public interface PerformOperation {
		 boolean check(int a);
	}
	
	public PerformOperation isOdd() {
	    return (a -> a % 2 != 0);
	}
	
	public PerformOperation isPrime() {
	    return (a -> a == 2 || (a % 2 != 0 && LongStream
	    		.range(2, (long)(Math.sqrt(a)) + 1)
	    		.filter(n -> n % 2 != 0)
	    		.noneMatch(n -> a/n == 0)));
	}
	
	public PerformOperation isPalindrome() {
	    return (a -> a == IntStream
	    					.iterate(a, i -> i / 10)
	    					.map(n -> n % 10)
	    					.reduce(0, (i, j) -> i * 10 + j));
	}
	
}
