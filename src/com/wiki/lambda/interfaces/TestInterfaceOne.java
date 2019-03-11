package com.wiki.lambda.interfaces;

@FunctionalInterface
public interface TestInterfaceOne {

	public void process(int number);
	
	default void print() {
		System.out.println("Inside Test Interface 1");
	}
}
