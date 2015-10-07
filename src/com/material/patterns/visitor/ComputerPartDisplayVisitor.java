package com.material.patterns.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying a computer");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying a mouse");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying a keyboard");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying a monitor");
	}
}
