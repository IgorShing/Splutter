package com.material.patterns.strategy;

import com.material.logic.Demo;

public class StrategyPatternDemo implements Demo {

	private static final String NAME = "Strategy Pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		ContextStrategyPattern context = new ContextStrategyPattern(new OperationAdd());
		System.out.println(context.executeStrategy(10, 20));
	}
}
