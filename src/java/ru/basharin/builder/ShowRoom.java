package ru.basharin.builder;

public class ShowRoom {
    public static void main(String[] args) {
        Seller seller = new Seller();

        seller.setBuilder(new VolvoCarBuilder());
        Car car = seller.builderCar();

        System.out.println(car);
    }
}
