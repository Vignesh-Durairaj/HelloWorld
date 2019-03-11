package com.vikhi.main;

import com.wiki.lambda.interfaces.TestInterfaceOne;
import com.wiki.lambda.interfaces.TestInterfaceTwo;

public class InterfaceTestMain implements TestInterfaceOne, TestInterfaceTwo{

	@Override
	public void process(int number) {
		init();
		System.out.println("Inside the implemented class");
		print();
	}

	@Override
	public void print() {
		TestInterfaceOne.super.print();
	}
	
	public static void main(String[] args) {
		InterfaceTestMain iTest = new InterfaceTestMain();
		iTest.process(10);
	}

}
