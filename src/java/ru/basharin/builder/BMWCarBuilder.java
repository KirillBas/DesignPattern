package ru.basharin.builder;

public class BMWCarBuilder extends CarBuilder {
    @Override
    void buildBrand() {
        car.setBrand(Brand.BMW);
    }

    @Override
    void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    void buildPrice() {
        car.setPrice(500000);
    }
}
