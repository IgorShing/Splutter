package com.material.patterns.visitor;

import com.material.logic.Demo;

public class VisitorPatternDemo implements Demo {

	public static final String NAME = "Visitor pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());

	}

}
