package ru.basharin.command;

public class RealPilot {
    Pilot airplaneFly;
    Pilot helicopterFly;
    Pilot missileFly;
    Pilot aircraftCarpetFly;

    public RealPilot(Pilot airplaneFly, Pilot helicopterFly, Pilot missileFly, Pilot aircraftCarpetFly) {
        this.airplaneFly = airplaneFly;
        this.helicopterFly = helicopterFly;
        this.missileFly = missileFly;
        this.aircraftCarpetFly = aircraftCarpetFly;
    }

    public void flyAirplane() {
        airplaneFly.fly();
    }

    public void flyHelicopter() {
        helicopterFly.fly();
    }

    public void flyMissile() {
        missileFly.fly();
    }

    public void flyAircraftCarpet() {
        aircraftCarpetFly.fly();
    }
}
