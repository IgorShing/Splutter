package com.material.patterns.decorator;

import com.material.logic.Demo;

public class DecoratorPatternDemo implements Demo {

	private static final String NAME = "Decorator pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		Shape circle = new Circle();
		circle.draw();

		System.out.println("Decorators:");

		Shape decoratedCircle = new RedShapeDecorator(new Circle());
		decoratedCircle.draw();

		Shape decaratedRectangle = new RedShapeDecorator(new Rectangle());
		decaratedRectangle.draw();
	}
}
