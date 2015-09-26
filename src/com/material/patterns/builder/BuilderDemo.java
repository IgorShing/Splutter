package com.material.patterns.builder;

import com.material.logic.Demo;

public class BuilderDemo implements Demo {

	private static final String	NAME	= "Builder pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		MealBuilder builder = new MealBuilder();

		Meal vegMeal = builder.prepareVegMeal();
		Meal nonVegMeal = builder.prepareNonVegMeal();

		System.out.println("Vegeterian meal:");
		vegMeal.showItems();
		System.out.println();

		System.out.println("Nonvegeterian meal:");
		nonVegMeal.showItems();
	}
}
