package ru.basharin.decorator;

public class LeadJavaDeveloper extends Decorator {
    public LeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeSubject() {
        return "Make subject ";
    }

    @Override
    public String makeWork() {
        return super.makeWork() + makeSubject();
    }
}
