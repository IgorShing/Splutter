package com.material.patterns.interpreter;

import com.material.logic.Demo;

public class InterpreterPatternDemo implements Demo {

	private static final String NAME = "Interpreter pattren";
	private FactoryProducer factoryProducer = new FactoryProducer();
	private AbstractExpressionFactory logicExpFactory = factoryProducer.getFactory(Factories.LOGIC_EXPRESSION_FACTORY);
	private AbstractExpressionFactory terminalExpFactory = factoryProducer.getFactory(Factories.TERMINAL_EXPRESSION);

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? "
				+ isMarriedWoman.interpret("Married Julie"));

	}

	//Rule: Robert and John are male
	public Expression getMaleExpression(){
		Expression robert = terminalExpFactory.getTerminalExpression("Robert");
		Expression john = terminalExpFactory.getTerminalExpression("John");
		return logicExpFactory.getLogicExpression(robert, john, ExpressionTypes.OR_EXPRESSION);
	}

	//Rule: Julie is a married women
	public Expression getMarriedWomanExpression(){
		Expression julie = terminalExpFactory.getTerminalExpression("Julie");
		Expression married = terminalExpFactory.getTerminalExpression("Married");
		return logicExpFactory.getLogicExpression(julie, married, ExpressionTypes.AND_EXPRESSION);
	}
}
