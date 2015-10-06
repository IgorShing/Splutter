package com.material.patterns.observer;

import com.material.logic.Demo;

public class ObserverPatternDemo implements Demo {

	private static final String NAME = "Observer pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {

		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
