package com.material.patterns.state;

import com.material.logic.Demo;

public class StatePatternDemo implements Demo {

	public static final String NAME = "State pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}
}
