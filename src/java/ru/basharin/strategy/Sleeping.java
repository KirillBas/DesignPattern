package ru.basharin.strategy;

public class Sleeping implements Active {
    @Override
    public void justDoIt() {
        System.out.println("Sleep");
    }
}
