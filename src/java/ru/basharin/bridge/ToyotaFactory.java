package ru.basharin.bridge;

public class ToyotaFactory extends ChinaFactory {


    public ToyotaFactory(Engineer engineer) {
        super(engineer);
    }

    @Override
    public void carAssembly() {
        System.out.println("Toyota factory work");
        engineer.assembly();
    }
}
