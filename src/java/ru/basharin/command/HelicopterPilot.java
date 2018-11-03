package ru.basharin.command;

public class HelicopterPilot implements Pilot {
    Airport airport;

    public HelicopterPilot(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void fly() {
        airport.helicopter();
    }
}
