package ru.basharin.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {
    public static void main(String[] args) {
        DevelopersFactory developersFactory = new DevelopersFactory();

        List<Developer> developerList = new ArrayList<>();

        developerList.add(developersFactory.getDeveloperBySpeciality("web"));
        developerList.add(developersFactory.getDeveloperBySpeciality("web"));
        developerList.add(developersFactory.getDeveloperBySpeciality("web"));
        developerList.add(developersFactory.getDeveloperBySpeciality("backend"));
        developerList.add(developersFactory.getDeveloperBySpeciality("backend"));
        developerList.add(developersFactory.getDeveloperBySpeciality("backend"));

        for (Developer developer: developerList) {
            developer.writeCode();
        }
    }
}
