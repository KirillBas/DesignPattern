package ru.basharin.command;

public class AirplanePilot implements Pilot {
    Airport airport;

    public AirplanePilot(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void fly() {
        airport.airplane();
    }
}
