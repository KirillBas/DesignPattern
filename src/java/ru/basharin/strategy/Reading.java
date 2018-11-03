package ru.basharin.strategy;

public class Reading implements Active {
    @Override
    public void justDoIt() {
        System.out.println("Read");
    }
}
