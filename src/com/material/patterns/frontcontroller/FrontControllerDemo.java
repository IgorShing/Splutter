package com.material.patterns.frontcontroller;

import com.material.logic.Demo;

public class FrontControllerDemo implements Demo {

	public static final String NAME = "Front controller pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		FrontController frontController = new FrontController();

		frontController.dispatchRequest(new Request("HOME"));
		frontController.dispatchRequest(new Request("STUDENT"));
	}
}
