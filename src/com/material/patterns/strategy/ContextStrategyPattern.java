package com.material.patterns.strategy;

public class ContextStrategyPattern {

	private Strategy strategy;

	public ContextStrategyPattern(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int number1, int number2)
	{
		return strategy.doOperation(number1, number2);
	}
}
