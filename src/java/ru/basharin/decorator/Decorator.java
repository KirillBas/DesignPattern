package ru.basharin.decorator;

public class Decorator implements Developer{
    Developer developer;

    public Decorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeWork() {
        return developer.makeWork();
    }
}
