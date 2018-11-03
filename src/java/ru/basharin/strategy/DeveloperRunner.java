package ru.basharin.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActive(new Reading());
        developer.executeActivity();
        developer.setActive(new Sleeping());
        developer.executeActivity();
        developer.setActive(new Coding());
        developer.executeActivity();
    }
}
