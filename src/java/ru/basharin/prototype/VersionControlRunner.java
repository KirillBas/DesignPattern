package ru.basharin.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project origin = new Project(1, "Git", "Some code");
        System.out.println(origin);
        System.out.println("\n ______________ \n");
        ProjectFactory factory = new ProjectFactory(origin);
        Project copyOrigin = factory.projectClone();
        System.out.println(copyOrigin);
    }
}
