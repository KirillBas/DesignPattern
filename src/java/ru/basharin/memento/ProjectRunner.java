package ru.basharin.memento;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Repository repository = new Repository();

        System.out.println("new project ver. 1");
        project.setDateAndVersion("version 1");
        System.out.println(project);
        System.out.println("save project on repository");
        repository.setSave(project.save());
        System.out.println("Write code, and commit. Version 1.2");
        project.setDateAndVersion("version 1.2");
        System.out.println(project);
        System.out.println("Allert!!, roll back");
        project.load(repository.getSave());
        System.out.println(project);
    }
}
