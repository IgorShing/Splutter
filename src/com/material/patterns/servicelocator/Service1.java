package com.material.patterns.servicelocator;

public class Service1 implements Service {

	public static final String NAME = "Service1";
	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void execute() {
		System.out.println("Executing " + NAME);
	}

}
