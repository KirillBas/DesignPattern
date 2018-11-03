package ru.basharin;

import ru.basharin.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton.getSingleton().writeSingleton("Сижу за решоткой \n");
        Singleton.getSingleton().writeSingleton("В темнице сырой \n");
        Singleton.getSingleton().writeSingleton("Вскормленный в неволе \n");
        Singleton.getSingleton().writeSingleton("Орел молодой \n");

        Singleton.getSingleton().showSingleton();
    }
}
