package ru.basharin.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isCpp = getCppExpression();
        Expression isCppEEExpression = getCppEEExpression();

        System.out.println("This is test Cpp expression " + isCpp.interpret("Cpp"));
        System.out.println("This is test Cpp expression " + isCppEEExpression.interpret("Power"));
    }

    public static Expression getCppExpression() {
        Expression cpp = new TerminalExpression("Cpp");
        Expression cppCore = new TerminalExpression("Cpp Core");

        return new ORExpression(cpp, cppCore);
    }

    public static Expression getCppEEExpression() {
        Expression cpp = new TerminalExpression("Cpp");
        Expression cppCore = new TerminalExpression("Power");

        return new ANDExpression(cpp, cppCore);
    }
}
