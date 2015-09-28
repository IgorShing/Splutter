package com.material.patterns.facade;

import com.material.logic.Demo;

public class FacadePatternDemo implements Demo {

	private static final String NAME = "Facade pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
