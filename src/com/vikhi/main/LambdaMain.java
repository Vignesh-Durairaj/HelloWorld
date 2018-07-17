package com.vikhi.main;

import com.wiki.lambda.BehaveLambdaExecutor;
import com.wiki.lambda.HelloWorldExecutor;

public class LambdaMain {

	public static void main(String[] args) {
		BehaveLambdaExecutor behaveExecutor = new BehaveLambdaExecutor();
		behaveExecutor.execute(5);
		behaveExecutor.execute(null);
		
		HelloWorldExecutor helloWorldExecutor = new HelloWorldExecutor();
		helloWorldExecutor.execute("Vignesh", "Durairaj");
		helloWorldExecutor.execute(null, null);
	}
}
