package ru.basharin.command;

public class MissilePilot implements Pilot {
    Airport airport;

    public MissilePilot(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void fly() {
        airport.missile();
    }
}
