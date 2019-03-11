package com.wiki.lambda.interfaces;

@FunctionalInterface
public interface TestInterfaceTwo {

	public void process(int number);
	
	default void print() {
		System.out.println("Inside Test Interface 2");
	}
	
	default void init() {
		System.out.println("Inside init method of interface 2");
	}
}
