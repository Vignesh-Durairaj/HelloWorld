package com.wiki.lambda.interfaces;

@FunctionalInterface
public interface IOperation<I, O> {
	public O operate (I i);
}
