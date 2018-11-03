package ru.basharin.adapter;

public class AdapterDataBaseProgramBase extends ProgramBase implements DataBase {
    @Override
    public void create() {
        insertData();
    }

    @Override
    public void update() {
        updateData();
    }

    @Override
    public void read() {
        readData();
    }

    @Override
    public void delete() {
        deleteData();
    }
}
