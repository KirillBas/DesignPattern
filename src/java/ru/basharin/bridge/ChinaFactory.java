package ru.basharin.bridge;

public abstract class ChinaFactory {
    protected Engineer engineer;

    public ChinaFactory(Engineer engineer) {
        this.engineer = engineer;
    }

    public abstract void carAssembly();
}
