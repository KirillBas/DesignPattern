package ru.basharin.chain;

public abstract class CrewList {
    private int priority;
    private CrewList nextPosition;

    public CrewList(int priority) {
        this.priority = priority;
    }

    public void setNextPosition(CrewList nextPosition) {
        this.nextPosition = nextPosition;
    }

    public void positionManager(String message, int level) {
        if (level >= priority) {
            send(message);
        }
        if (nextPosition != null) {
            nextPosition.positionManager(message, level);
        }
    }

    public abstract void send(String message);
}
