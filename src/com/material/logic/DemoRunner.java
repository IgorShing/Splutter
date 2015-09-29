package com.material.logic;

import com.material.logic.patterns.PatternExampleRunner;
import com.material.logic.patterns.Patterns;

/**
 * Will be replaced by an endpoint. Need the pattern strategy.
 *
 * @author Igor_Shingaryov
 *
 */
public class DemoRunner {

	public static void main(String[] args) {

<<<<<<< HEAD
		Patterns currentPattern = Patterns.FACADE;
=======
		Patterns currentPattern = Patterns.DATA_ACCESS_OBJECT;
>>>>>>> 65eb446419e2b89596f98fa85a3784fd9c667d74

		try {
			PatternExampleRunner.PatternExampleRunnerHolder.getInstance()
			        .runPatternExample(currentPattern);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		/*
		 * String exampleName = "Example JSON"; Demo example;
		 * 
		 * switch (exampleName) { case "Example JSON": example = new
		 * ExampleJson(); example.run(); break;
		 * 
		 * default: }
		 * 
		 * System.out.println("Execution is completed.");
		 */
	}
}
