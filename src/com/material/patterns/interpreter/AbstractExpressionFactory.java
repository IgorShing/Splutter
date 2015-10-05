package com.material.patterns.interpreter;

public abstract class AbstractExpressionFactory {

	abstract Expression getTerminalExpression(String data);

	abstract Expression getLogicExpression(Expression exp1, Expression exp2, ExpressionTypes expressionType);
}
