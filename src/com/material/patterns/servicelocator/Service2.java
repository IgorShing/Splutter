package com.material.patterns.servicelocator;

public class Service2 implements Service {

	public static final String NAME = "Service2";
	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void execute() {
		System.out.println("Executing " + NAME);
	}

}
