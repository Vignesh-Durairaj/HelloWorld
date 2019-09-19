package com.wiki.lambda;

import com.wiki.lambda.interfaces.IBehave;

public class BehaveLambdaExecutor {

	private IBehave doublingBehavior = n -> (n != null) ? n * 2 : null;
	private IBehave triplingBehavior = n -> (n != null) ? n * 3 : null;
	private IBehave addFiveBeahvior = n -> (n != null) ? n + 5 : null;
	private IBehave squaringBehavior = n -> (n != null) ? n * n : null;
	
	public void execute(Integer a) {
		System.out.println("Doubling Behaviour is : " + doublingBehavior.getBehavior(a));
		System.out.println("Tripling Behaviour is : " + triplingBehavior.getBehavior(a));
		System.out.println("Adding Behaviour is : " + addFiveBeahvior.getBehavior(a));
		System.out.println("Squaring Behaviour is : " + squaringBehavior.getBehavior(a));
	}
}
