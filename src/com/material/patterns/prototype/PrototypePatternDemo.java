package com.material.patterns.prototype;

import com.material.logic.Demo;

public class PrototypePatternDemo implements Demo {

	public static final String NAME = "Prototype pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		ShapeCache.loadCache();

		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}

}
