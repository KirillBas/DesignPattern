package ru.basharin.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DevelopersFactory {
    private final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);
        if (developer == null) {
            switch (speciality) {
                case "web":
                    System.out.println("Hiring web developer");
                    developer = new WebDeveloper();
                    break;
                case "backend":
                    System.out.println("Hiring back developer");
                    developer = new BackEndDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
