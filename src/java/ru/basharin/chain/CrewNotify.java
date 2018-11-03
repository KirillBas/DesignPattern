package ru.basharin.chain;

public class CrewNotify {
    public static void main(String[] args) {
        CrewList secondOfficer = new SecondOfficer(Priority.NORMAL);
        CrewList chiefMate = new ChiefMate(Priority.SERIOUSLY);
        CrewList captain = new Captain(Priority.VERYIMPORTANT);

        secondOfficer.setNextPosition(chiefMate);
        chiefMate.setNextPosition(captain);

        secondOfficer.positionManager("All is OK ", Priority.NORMAL);
        secondOfficer.positionManager("Something wrong ", Priority.SERIOUSLY);
        secondOfficer.positionManager("ALARM!!!! ", Priority.VERYIMPORTANT);
    }
}
