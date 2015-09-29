package com.material.patterns.builder;

public class VegBurger extends Burger {

	@Override
	public float price() {
		return 100.0f;
	}

	@Override
	public String name() {
		return "Vegetarian burger";
	}
}
