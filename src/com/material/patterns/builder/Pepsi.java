package com.material.patterns.builder;

public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 80.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}
