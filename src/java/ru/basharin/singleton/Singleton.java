package ru.basharin.singleton;

public class Singleton {
    private static Singleton singleton;
    private static String letter = "This is singleton \n\n";

    private Singleton() {
    }

    public static synchronized Singleton getSingleton() {
        if (singleton== null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void writeSingleton(String text) {
        letter += text + "\n";
    }

    public void showSingleton() {
        System.out.println(letter);
    }
}
