package ru.basharin.chain;

public class Captain extends CrewList {

    public Captain(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("Avral!!!!: " + message);
    }
}
