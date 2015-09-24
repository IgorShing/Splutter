package com.material.logic.patterns;

public enum Patterns {

	ABSTRACT_FACTORY("Abstract factory pattern"),
	ADAPTER("Adapter pattern"),
	BRIDGE("Bridge pattern"),
	BUILDER("Builder pattern"),
	BUSINESS_DELEGATE("Business delegate pattern"),
	CHAIN_OF_RESPONSIBILITY("Chain of responsibility pattern"),
	COMMAND("Command pattern"),
	COMPOSITE_ENTITY("Composite entity pattern"),
	COMPOSITE("Composite pattern"),
	DATA_ACCESS_OBJECT("Data access object pattern"),
	DECORATOR("Decorator pattern"),
	FACADE("Facade pattern"),
	FACTORY("Factory pattern"),
	FILTER("Filter pattern"),
	FLYWEIGHT("Flyweight pattern"),
	FRONT_CONTROLLER("Front controller pattern"),
	INTERCEPTING_FILTER("Intercepting filter pattern"),
	INTERPRETER("Interpreter pattern"),
	ITERATOR("Iterator pattern"),
	MEDIATOR("Mediator pattern"),
	MEMENTO("Memento pattern"),
	MVC("MVC pattern"),
	NULL_OBJECT("Null object pattern"),
	OBSERVER("Observer pattern"),
	PROTOTYPE("Prototype pattern"),
	PROXY("Proxy pattern"),
	SERVICE_LOCATOR("Service locator pattern"),
	SINGLETON("Singleton pattern"),
	STATE("State pattern"),
	STRATEGY("Strategy pattern"),
	TEMPLATE("Template pattern"),
	TRANSFER_OBJECT("Transfer object pattern"),
	VISITOR("Visitor pattern");

	private String name;

	private Patterns(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
