package com.material.patterns.businessdelegate;

import com.material.logic.Demo;

public class BusinessDelegateDemo implements Demo {

	private static final String	NAME	= "Business delegate pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();
	}

}
