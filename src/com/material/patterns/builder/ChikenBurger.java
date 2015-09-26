package com.material.patterns.builder;

public class ChikenBurger extends Burger {

	@Override
	public float price() {
		return 50.0f;
	}

	@Override
	public String name() {
		return "Chiken burger";
	}
}
