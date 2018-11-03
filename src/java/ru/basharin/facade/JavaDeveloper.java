package ru.basharin.facade;

public class JavaDeveloper {
    public void doWorkToTask(BugTracker bugTracker) {
        if (bugTracker.isActiveTask()) {
            System.out.println("Work, work, work");
        } else {
            System.out.println("Rest");
        }
    }
}
