package com.material.patterns.nullobject;

import com.material.logic.Demo;

public class NullObjectPatternDemo implements Demo {

	public static final String NAME = "Null object pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {

		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
