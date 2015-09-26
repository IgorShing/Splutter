package com.material.patterns.bridge;

/**
 * The bridge implementor.
 * 
 * @author Admin
 *
 */
public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius
				+ ", x: " + x + ", " + y + "]");
	}
}
