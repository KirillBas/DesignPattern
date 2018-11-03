package ru.basharin.chain;

public class ChiefMate extends CrewList {
    public ChiefMate(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("something went wrong.: " + message);
    }
}
