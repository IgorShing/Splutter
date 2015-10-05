package com.material.patterns.interpreter;

public class TerminalExpressionFactory extends AbstractExpressionFactory {

	@Override
	Expression getTerminalExpression(String data) {
		return new TerminalExpression(data);
	}

	@Override
	Expression getLogicExpression(Expression exp1, Expression exp2, ExpressionTypes expressionType) {
		return null;
	}
}
