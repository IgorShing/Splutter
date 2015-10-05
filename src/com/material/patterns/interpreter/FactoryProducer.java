package com.material.patterns.interpreter;

public class FactoryProducer {

	public AbstractExpressionFactory getFactory(Factories factoryType)
	{
		if (factoryType == Factories.LOGIC_EXPRESSION_FACTORY)
		{
			return new LogicExpressionFactory();
		} else
			if (factoryType == Factories.TERMINAL_EXPRESSION)
			{
				return new TerminalExpressionFactory();
			} else
			{
				System.out.println("No spicified factory can be created.");
			}
		return null;
	}
}
