package com.material.patterns.facade;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() + " | " + "draw()");
	}
}
