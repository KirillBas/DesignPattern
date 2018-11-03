package ru.basharin.builder;

public class Car {
    private Brand brand;
    private String engine;
    private int price;

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                '}';
    }
}
