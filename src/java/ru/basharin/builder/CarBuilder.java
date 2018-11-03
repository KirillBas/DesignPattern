package ru.basharin.builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildBrand();
    abstract void buildEngine();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
