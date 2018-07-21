package com.wiki.lambda;

import com.vikhi.utils.OperationUtils;
import com.wiki.lambda.interfaces.IPrimitiveOps;

public class MethodReferencesExecutor {

	public void execute (int a, int b) {
		System.out.println("Add Operation : " + operate(a, b, OperationUtils::add));
		System.out.println("Subtraction Operation : " + operate(a, b, OperationUtils::sub));
		System.out.println("Multiplication Operation : " + operate(a, b, OperationUtils::multiply));
		System.out.println("Divide Operation : " + operate(a, b, OperationUtils::divide));
		System.out.println("Maximum Operation : " + operate(a, b, OperationUtils::max));
		System.out.println("Minimum Operation : " + operate(a, b, OperationUtils::min));
	}
	
	public int operate (int a, int b, IPrimitiveOps primitiveOps) {
		return primitiveOps.performOperation(a, b);
	}
}
