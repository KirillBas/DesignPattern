package ru.basharin.command;

public class Operator {
    public static void main(String[] args) {
        Airport airport = new Airport();
        RealPilot realPilot = new RealPilot(
                new AirplanePilot(airport),
                new AircraftCarpetPilot(airport),
                new HelicopterPilot(airport),
                new MissilePilot(airport)
        );

        realPilot.flyAirplane();
        realPilot.flyAircraftCarpet();
        realPilot.flyHelicopter();
        realPilot.flyMissile();
    }
}
