package com.material.patterns.factory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() + " | " + "draw()");
	}
}
