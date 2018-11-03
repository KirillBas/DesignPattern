package ru.basharin.interpreter;

public class TerminalExpression implements Expression{
    private String input;

    public TerminalExpression(String input) {
        this.input = input;
    }

    @Override
    public boolean interpret(String expression) {
        if (expression.contains(input)) {
            return true;
        }
        return false;
    }
}
