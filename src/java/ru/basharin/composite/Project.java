package ru.basharin.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstPhpDeveloper = new PhpDeveloper();
        Developer secondPhpDeveloper = new PhpDeveloper();
        Developer firstNetDeveloper = new NetDeveloper();

        team.addDeveloper(firstPhpDeveloper);
        team.addDeveloper(secondPhpDeveloper);
        team.addDeveloper(firstNetDeveloper);

        team.createProject();

    }
}
