package ru.basharin.decorator;

public class SeniorJavaDeveloper extends Decorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeReview() {
        return "Make review ";
    }

    @Override
    public String makeWork() {
        return super.makeWork() + makeReview();
    }
}
