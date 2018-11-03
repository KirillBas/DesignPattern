package ru.basharin.decorator;

public class Project {
    public static void main(String[] args) {
        Developer developer = new LeadJavaDeveloper(new SeniorJavaDeveloper(new MiddleJavaDeveloper()));

        System.out.println(developer.makeWork());
    }
}
