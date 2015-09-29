package com.material.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes meal - the object to build.
 *
 * @author Admin
 *
 */
public class Meal {

	private List<Item>	items	= new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float totalPrice = 0.0f;

		for (Item item : items) {
			totalPrice += item.price();
		}
		return totalPrice;
	}

	public void showItems() {

		System.out.println("Items: ");

		for (Item item : items) {
			System.out.println("Name: " + item.name());
			System.out.println("Packing: " + item.packing().packName());
			System.out.println("Price: " + item.price());
		}
	}

}
