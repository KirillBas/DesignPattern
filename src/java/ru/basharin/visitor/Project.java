package ru.basharin.visitor;

public class Project implements ProjectElement {
    private ProjectElement[] projectElements;

    public Project() {
        projectElements = new ProjectElement[] {
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element: projectElements) {
            element.beWritten(developer);
        }
    }
}
