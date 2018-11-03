package ru.basharin.builder;

public class Seller {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car builderCar() {
        builder.createCar();
        builder.buildBrand();
        builder.buildEngine();
        builder.buildPrice();

        Car car = builder.getCar();

        return car;
    }
}
