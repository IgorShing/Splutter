package com.material.patterns.proxy;

import com.material.logic.Demo;

public class ProxyPatternDemo implements Demo {

	public static final String NAME = "Proxy pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		Image image = new ProxyImage("test_10mb.jpg");

		//image will be loaded from disk
		image.display();
		System.out.println("");

		//image will not be loaded from disk
		image.display();
	}

}
