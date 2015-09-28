package com.material.patterns.decorator;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() + " | draw()");
	}
}
