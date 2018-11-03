package ru.basharin.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project= new ProxyProject("htpp://google.com/asplinc");
        project.run();
    }
}
