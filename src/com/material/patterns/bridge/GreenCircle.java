package com.material.patterns.bridge;

/**
 * The bridge implementor.
 *
 * @author Admin
 *
 */
public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius
				+ ", x: " + x + ", " + y + "]");

	}

}
