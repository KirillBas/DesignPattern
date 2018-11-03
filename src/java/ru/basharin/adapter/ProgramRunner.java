package ru.basharin.adapter;

public class ProgramRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterDataBaseProgramBase();

        dataBase.create();
        dataBase.read();
        dataBase.delete();
        dataBase.update();
    }
}
