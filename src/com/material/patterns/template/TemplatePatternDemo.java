package com.material.patterns.template;

import com.material.logic.Demo;

public class TemplatePatternDemo implements Demo {

	public static final String NAME = "Template pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		Game game = new Cricket();
		game.play();

		System.out.println();

		game = new Football();
		game.play();
	}

}
