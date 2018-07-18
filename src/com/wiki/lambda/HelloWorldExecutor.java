package com.wiki.lambda;

import com.wiki.lambda.interfaces.IHelloWorld;

public class HelloWorldExecutor {

	IHelloWorld helloWorldEng = (a, b) -> "Hello " + a + " " + b + " !";
	IHelloWorld helloWorldFra = (a, b) -> "Bonjour " + b + ", " + a + " !";
	IHelloWorld helloWorldSve = (a, b) -> "Hallå " + a + "-" + b + " !!!";
	
	public void execute(String firstName, String lastName) {
		System.out.println("English : " + helloWorldEng.sayHello(firstName, lastName));
		System.out.println("French : " + helloWorldFra.sayHello(firstName, lastName));
		System.out.println("Swedish : " + helloWorldSve.sayHello(firstName, lastName));
	}
}
