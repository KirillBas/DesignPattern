package ru.basharin.bridge;

public class SubaruFactory extends ChinaFactory {
    public SubaruFactory(Engineer engineer) {
        super(engineer);
    }

    @Override
    public void carAssembly() {
        System.out.println("Subaru factory work");
        engineer.assembly();
    }
}
