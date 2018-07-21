package com.vikhi.main;

import com.wiki.lambda.BehaveLambdaExecutor;
import com.wiki.lambda.HelloWorldExecutor;
import com.wiki.lambda.MethodReferencesExecutor;
import com.wiki.lambda.OperationExecutor;

public class LambdaMain {

	public static void main(String[] args) {
		BehaveLambdaExecutor behaveExecutor = new BehaveLambdaExecutor();
		behaveExecutor.execute(5);
		behaveExecutor.execute(null);
		
		HelloWorldExecutor helloWorldExecutor = new HelloWorldExecutor();
		helloWorldExecutor.execute("Vignesh", "Durairaj");
		helloWorldExecutor.execute(null, null);
		
		OperationExecutor operationExecutor = new OperationExecutor();
		operationExecutor.execute(null, null);
		operationExecutor.execute(10, "Test String");
		
		MethodReferencesExecutor methodReferenceExecutor = new MethodReferencesExecutor();
		methodReferenceExecutor.execute(10, 9);
		methodReferenceExecutor.execute(1, 12);
		methodReferenceExecutor.execute(0, 9);
		methodReferenceExecutor.execute(10, 0);
	}
}
