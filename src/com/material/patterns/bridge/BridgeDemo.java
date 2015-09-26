package com.material.patterns.bridge;

import com.material.logic.Demo;

public class BridgeDemo implements Demo {

	private static final String	NAME	= "Bridge";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {

		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();

	}

}
