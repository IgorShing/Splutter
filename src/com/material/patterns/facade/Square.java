package com.material.patterns.facade;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() + " | " + "draw()");
	}
}
