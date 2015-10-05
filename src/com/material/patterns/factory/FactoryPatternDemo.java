package com.material.patterns.factory;

import com.material.logic.Demo;

public class FactoryPatternDemo implements Demo {

	public static final String NAME = "Factory pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		ShapeFactory factory = new ShapeFactory();

		Shape shapeCircle = factory.getShape("Circle");
		shapeCircle.draw();

		Shape shapeSquare = factory.getShape("Square");
		shapeSquare.draw();

		Shape shapeRectangle = factory.getShape("Rectangle");
		shapeRectangle.draw();


	}

}
