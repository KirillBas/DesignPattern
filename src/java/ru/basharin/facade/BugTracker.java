package ru.basharin.facade;

public class BugTracker {
    private boolean activeTask;

    public boolean isActiveTask() {
        return activeTask;
    }

    public void startTask() {
        System.out.println("Task is active");
        activeTask = true;
    }

    public void finishTask() {
        System.out.println("Task is finish");
        activeTask= false;
    }
}
