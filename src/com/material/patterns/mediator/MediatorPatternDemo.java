package com.material.patterns.mediator;

import com.material.logic.Demo;

public class MediatorPatternDemo implements Demo {

	public static final String NAME = "Mediator pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {

		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
