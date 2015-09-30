package com.material.logic.patterns;

import java.util.HashMap;
import java.util.Map;

import com.material.logic.Demo;

// TODO Make it singleton with Spring

public class PatternExampleRunner {

	private static Map<Patterns, String>	patternDemos	= new HashMap<Patterns, String>();

	private PatternExampleRunner() {
		patternDemos.put(Patterns.ABSTRACT_FACTORY,
				"com.material.patterns.abstractfactory.AbsractFactoryDemo");
		patternDemos.put(Patterns.ADAPTER,
				"com.material.patterns.adapter.AdapterDemo");
		patternDemos.put(Patterns.BRIDGE,
				"com.material.patterns.bridge.BridgeDemo");
		patternDemos.put(Patterns.BUILDER,
				"com.material.patterns.builder.BuilderDemo");
		patternDemos.put(Patterns.BUSINESS_DELEGATE,
				"com.material.patterns.businessdelegate.BusinessDelegateDemo");
		patternDemos
		.put(Patterns.CHAIN_OF_RESPONSIBILITY,
				"com.material.patterns.chainofresponsibility.ChainOfResponsibilityDemo");
		patternDemos.put(Patterns.COMMAND,
				"com.material.patterns.command.CommandPatternDemo");
		patternDemos
		.put(Patterns.COMPOSITE_ENTITY,
				"com.material.patterns.compositeentity.CompositeEntityPatternDemo");
		patternDemos.put(Patterns.COMPOSITE,
				"com.material.patterns.composite.CompositePatternDemo");
		patternDemos.put(Patterns.DATA_ACCESS_OBJECT,
				"com.material.patterns.dao.DaoPatternDemo");
		patternDemos.put(Patterns.DECORATOR, "com.material.patterns.decorator.DecoratorPatternDemo");
		patternDemos.put(Patterns.FACADE, "com.material.patterns.facade.FacadePatternDemo");
		patternDemos.put(Patterns.FACTORY, "com.material.patterns.factory.FactoryPatternDemo");
		patternDemos.put(Patterns.FILTER, "com.material.patterns.criteria.CriteriaPatternDemo");
		patternDemos.put(Patterns.FLYWEIGHT, "com.material.patterns.flyweight.FlyweightPatternDemo");
		patternDemos.put(Patterns.FRONT_CONTROLLER, "com.material.patterns.frontcontroller.FrontControllerDemo");
		patternDemos.put(Patterns.INTERCEPTING_FILTER, "com.material.patterns.interceptingfilter.InterceptingFilterDemo");
		patternDemos.put(Patterns.INTERPRETER, "");
		patternDemos.put(Patterns.ITERATOR, "");
		patternDemos.put(Patterns.MEDIATOR, "");
		patternDemos.put(Patterns.MEMENTO, "");
		patternDemos.put(Patterns.MVC, "");
		patternDemos.put(Patterns.NULL_OBJECT, "");
		patternDemos.put(Patterns.OBSERVER, "");
		patternDemos.put(Patterns.PROTOTYPE, "");
		patternDemos.put(Patterns.PROXY, "");
		patternDemos.put(Patterns.SERVICE_LOCATOR, "");
		patternDemos.put(Patterns.SINGLETON, "");
		patternDemos.put(Patterns.STATE, "");
		patternDemos.put(Patterns.STRATEGY,
				"com.material.patterns.strategy.StrategyPatternDemo");
		patternDemos.put(Patterns.TEMPLATE, "");
		patternDemos.put(Patterns.TRANSFER_OBJECT, "");
		patternDemos.put(Patterns.VISITOR, "");

	}

	/**
	 * Runs the pattern example.
	 *
	 * @param pattern
	 * @throws Exception
	 */
	public void runPatternExample(Patterns pattern) throws Exception {
		String className = patternDemos.get(pattern);

		if (className == null || className.trim().isEmpty()) {
			throw new Exception(
					"Error while retrieving the pattern name. No such an example.");
		}

		Object patternExample;
		patternExample = Class.forName(className).newInstance();

		if (patternExample != null && patternExample instanceof Demo) {
			Demo patternDemo = (Demo) patternExample;
			patternDemo.run();
		}
	}

	// To implement singleton pattern
	public static class PatternExampleRunnerHolder {
		public static PatternExampleRunner	instance	= new PatternExampleRunner();

		public static PatternExampleRunner getInstance() {
			return instance;
		}
	}
}
