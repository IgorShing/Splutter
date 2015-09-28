package com.material.patterns.facade;

/**
 * This is a facade in the Facade pattern.
 * @author Igor_Shingaryov
 *
 */
public class ShapeMaker {

	private Circle circle;
	private Square square;
	private Rectangle rectangle;

	public ShapeMaker() {
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}

	void drawCircle()
	{
		circle.draw();
	}

	void drawRectangle()
	{
		rectangle.draw();
	}

	void drawSquare()
	{
		square.draw();
	}
}
