package com.material.patterns.bridge;

public class Circle extends Shape {

	private int	radius;
	private int	x;
	private int	y;

	protected Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}
