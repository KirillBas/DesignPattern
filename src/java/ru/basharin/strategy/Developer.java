package ru.basharin.strategy;

public class Developer {
    private Active active;

    public void setActive(Active active) {
        this.active = active;
    }

    public void executeActivity() {
        active.justDoIt();
    }
}
