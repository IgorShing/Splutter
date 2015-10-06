package com.material.patterns.singleton;

import com.material.logic.Demo;

public class SingletonPatternDemo implements Demo {

	private static final String NAME = "Singleton pattern";
	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		//illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject object = new SingleObject();
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		//show the message
		object.showMessage();
	}

}
