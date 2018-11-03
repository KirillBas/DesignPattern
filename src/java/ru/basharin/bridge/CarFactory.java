package ru.basharin.bridge;

public class CarFactory {
    public static void main(String[] args) {
        ChinaFactory[] chinaFactories = {
                new ToyotaFactory(new ToyotaEngineer()),
                new SubaruFactory(new SubaruEngineer())
        };

        for (ChinaFactory factory: chinaFactories) {
            factory.carAssembly();
        }
    }


}
