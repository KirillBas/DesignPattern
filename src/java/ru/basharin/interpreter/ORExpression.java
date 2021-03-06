package ru.basharin.interpreter;

public class ORExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public ORExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String expression) {
        return expression1.interpret(expression) || expression2.interpret(expression);
    }
}
