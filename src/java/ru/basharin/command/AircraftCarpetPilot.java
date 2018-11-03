package ru.basharin.command;

public class AircraftCarpetPilot implements Pilot {
    Airport airport;

    public AircraftCarpetPilot(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void fly() {
        airport.aircraftCarpet();
    }
}
