package com.material.patterns.interpreter;

public class LogicExpressionFactory extends AbstractExpressionFactory{

	@Override
	Expression getTerminalExpression(String data) {
		return null;
	}

	@Override
	Expression getLogicExpression(Expression exp1, Expression exp2, ExpressionTypes expressionType) {

		if (expressionType.equals(ExpressionTypes.AND_EXPRESSION))
		{
			return new AndExpression(exp1, exp2);
		} else
			if (expressionType.equals(ExpressionTypes.OR_EXPRESSION))
			{
				return new OrExpression(exp1, exp2);
			}
		return null;
	}
}
