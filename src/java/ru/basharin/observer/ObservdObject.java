package ru.basharin.observer;

public interface ObservdObject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
