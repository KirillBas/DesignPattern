package ru.basharin.builder;

public class VolvoCarBuilder extends CarBuilder {
    @Override
    void buildBrand() {
        car.setBrand(Brand.Volvo);
    }

    @Override
    void buildEngine() {
        car.setEngine("V6");
    }

    @Override
    void buildPrice() {
        car.setPrice(400000);
    }
}
