package ru.basharin.chain;

public class SecondOfficer extends CrewList {

    public SecondOfficer(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("All is ok: " + message);
    }
}
