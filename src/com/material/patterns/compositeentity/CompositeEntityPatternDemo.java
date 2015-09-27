package com.material.patterns.compositeentity;

import com.material.logic.Demo;

public class CompositeEntityPatternDemo implements Demo {

	private static final String	NAME	= "Composite entity pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		Client client = new Client();

		client.setData("Test", "Data");
		client.printData();

		client.setData("Second Test", "Data1");
		client.printData();

	}

}
