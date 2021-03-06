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
		patternDemos.put(Patterns.INTERPRETER, "com.material.patterns.interpreter.InterpreterPatternDemo");
		patternDemos.put(Patterns.ITERATOR, "com.material.patterns.iterator.IteratorPatternDemo");
		patternDemos.put(Patterns.MEDIATOR, "com.material.patterns.mediator.MediatorPatternDemo");
		patternDemos.put(Patterns.MEMENTO, "com.material.patterns.memento.MementoPatternDemo");
		patternDemos.put(Patterns.MVC, "com.material.patterns.mvc.MvcPatternDemo");
		patternDemos.put(Patterns.NULL_OBJECT, "com.material.patterns.nullobject.NullObjectPatternDemo");
		patternDemos.put(Patterns.OBSERVER, "com.material.patterns.observer.ObserverPatternDemo");
		patternDemos.put(Patterns.PROTOTYPE, "com.material.patterns.prototype.PrototypePatternDemo");
		patternDemos.put(Patterns.PROXY, "com.material.patterns.proxy.ProxyPatternDemo");
		patternDemos.put(Patterns.SERVICE_LOCATOR, "com.material.patterns.servicelocator.ServiceLocatorPatternDemo");
		patternDemos.put(Patterns.SINGLETON, "com.material.patterns.singleton.SingletonPatternDemo");
		patternDemos.put(Patterns.STATE, "com.material.patterns.state.StatePatternDemo");
		patternDemos.put(Patterns.STRATEGY,
				"com.material.patterns.strategy.StrategyPatternDemo");
		patternDemos.put(Patterns.TEMPLATE, "com.material.patterns.template.TemplatePatternDemo");
		patternDemos.put(Patterns.TRANSFER_OBJECT, "com.material.patterns.tranferobject.TransferObjectPatternDemo");
		patternDemos.put(Patterns.VISITOR, "com.material.patterns.visitor.VisitorPatternDemo");

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
